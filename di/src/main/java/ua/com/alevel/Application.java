package ua.com.alevel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

public class Application {

    public static void run(Class<?> mailClass) {
        ApplicationContext context = new ApplicationContext(mailClass);
        context.createContext();
        Map<Class<?>, Object> map = context.getBeanMap();
        map.forEach((k, v) -> {
            if (v.getClass().isAnnotationPresent(Controller.class)) {
                for (Method declaredMethod : v.getClass().getDeclaredMethods()) {
                    if (declaredMethod.getName().equals("create")) {
                        try {
                            declaredMethod.invoke(v);
                        } catch (IllegalAccessException | InvocationTargetException e) {
                            e.printStackTrace();
                        }
                    }
                }

            }
        });
    }
}
