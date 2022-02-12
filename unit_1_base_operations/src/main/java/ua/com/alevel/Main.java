package ua.com.alevel;

//import java.math.BigDecimal;

//import java.lang.String;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class Main {

//    final int i = 0;
//    final Test t = new Test();

    private static void hack(Class<?> aClass) {

    }

    public static void main(String[] args) throws IllegalAccessException {

//        User u1 = new User();
//        u1.setName("Ivan");
//        System.out.println("u1 = " + u1);
//        u1.setName("Durak");
//        System.out.println("u1 = " + u1);

//        final FinalUser finalUser = new FinalUser("Ivan");
//        System.out.println("finalUser = " + finalUser);
//
//        Class<? extends FinalUser> fuClass = finalUser.getClass();
//        Field[] declaredFields = fuClass.getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            System.out.println("declaredField = " + declaredField);
//            declaredField.setAccessible(true);
//            declaredField.set(finalUser, "Durak");
//        }
//        System.out.println("finalUser = " + finalUser);

        RecordUser recordUser = new RecordUser("Ivan");
        System.out.println("recordUser = " + recordUser);
        System.out.println("recordUser name = " + recordUser.name());

        User user = new User();
        user.setName("Ivan");
        RecordObject recordObjectOnlyIvan = new RecordObject(user);
        System.out.println("recordObjectOnlyIvan = " + recordObjectOnlyIvan.user());

        user.setName("Durak");
        System.out.println("recordObjectOnlyIvan = " + recordObjectOnlyIvan.user());



//        Class<? extends RecordUser> ruClass = recordUser.getClass();
//        Field[] fields = ruClass.getDeclaredFields();
//        for (Field declaredField : fields) {
//            System.out.println("declaredField = " + declaredField);
//            declaredField.setAccessible(true);
//            declaredField.set(recordUser, "Durak");
//        }

//        Test test = new Test(8);
//        test = new Test();
//
//        final int i = 0;
//
//        final Test t;



//        System.out.println("test = " + test);
//        int a = 0;
//        System.out.println("a = " + a);



//        ClassLoader app = Thread.currentThread().getContextClassLoader();
//        System.out.println("app = " + app);
//        String main = Thread.currentThread().getName();
//        System.out.println("main = " + main);

//        System.out.println("Main.main");
//
//        long a = Long.MAX_VALUE;
//        long b = Long.MAX_VALUE;
//
//        long res = a + b;
//        System.out.println("res = " + res);
//
//        byte b1 = Byte.MAX_VALUE;
//        byte b2 = Byte.MAX_VALUE;
//        byte b3 = (byte) (b1 + b2);
//
//        System.out.println("b3 = " + b3);
//
//        System.out.println(2.0 - 1.1);
//
//        BigDecimal left = new BigDecimal("2.0");
//        BigDecimal right = new BigDecimal("1.1");
//
//        BigDecimal sub = left.subtract(right);
//        System.out.println(sub);
//
//        char ch1 = 'a';
//        System.out.println("ch1 = " + ch1);
//        System.out.println("ch1 = " + (int) ch1);
//
//        short s = 110;
//        System.out.println("s = " + s);
//        System.out.println("s = " + (char) s);
//
////        int[] ints = new int[]{ 1, 1 };
//
//        int[] ints = new int[10];
//
//        for (int i = 0; i < ints.length; i++) {
//            ints[i] = i;
//        }



//        int a = 10;
//        int b = a;
//        b = 15;
//        System.out.println("a = " + a);
//
//        User user1 = new User();
//        user1.setAge(10);
//        user1.setName("name1");
//        System.out.println("user1 = " + user1);
//
//        User user2 = user1;
//        user2.setAge(15);
//        System.out.println("user1 = " + user1);
    }

    private static class User1 {

        private int age;
        private String name;

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "User{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }
}
