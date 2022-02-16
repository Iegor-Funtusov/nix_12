package ua.com.alevel;

import org.reflections.Reflections;
import org.reflections.Store;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class ApplicationContext {

    private final Reflections scanner;
    private final Map<Class<?>, Object> beanMap = new HashMap<>();

    public ApplicationContext(Class<?> mainClass) {
        this.scanner = new Reflections(mainClass.getPackageName());
    }

    public void createContext() {
        Store appStore = scanner.getStore();
        appStore.forEach((key, value) -> {
            value.forEach((k, v) -> {
                if (BeanClass.class.getName().equals(k)) {
                    v.forEach(beanName -> {
                        try {
                            Class<?> beanClass = Class.forName(beanName);
                            Class<?> parent = beanClass.getInterfaces()[0];
                            try {
                                beanMap.put(parent, beanClass.getDeclaredConstructor().newInstance());
                            } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
                                e.printStackTrace();
                            }
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }
                    });
                }
            });
        });
        beanMap.forEach((interfaceBean, objectBean) -> {
            Class<?> bean = objectBean.getClass();
            Field[] declaredFields = bean.getDeclaredFields();
            for (Field declaredField : declaredFields) {
                if (declaredField.isAnnotationPresent(InjectBean.class)) {
                    Object injectBean = beanMap.get(declaredField.getType());
                    if (injectBean != null) {
                        declaredField.setAccessible(true);
                        try {
                            declaredField.set(objectBean, injectBean);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
    }

    public Map<Class<?>, Object> getBeanMap() {
        return beanMap;
    }
}
