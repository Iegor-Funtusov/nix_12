package ua.com.alevel;

import lombok.SneakyThrows;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringMain {
//    static User user1;

    @SneakyThrows
    public static void main(String[] args) {
//        System.out.println(new User());
//        List<User> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(new User(UUID.randomUUID().toString(), "test1"));
//        }
//        list.forEach(System.out::println);
//
//        final User user = new User("1", "test1"); // only 69266c3
//
//        String s = "1";
//        String s1 = "1";
//        String s2 = "1";
//
//        s = "2";
//        s = "3";
//        s = "4";
//
//        s = "0";
//
//        for (int i = 0; i < 1000; i++) {
//            s.concat(String.valueOf(i));
//        }
//
//
//        LaptopFilter filter = new LaptopFilter();
//
//        StringBuilder query = new StringBuilder("select * from laptops as l");
//        if (filter != null) {
//            query.append(" where ");
//            if (filter.getColor() != null) {
//                query.append("l '%like%' = ");
//            }
//            if (filter.getProducerCP() != null) {
//                query.append("l '%like%' = ");
//            }
//        }
//
//        StringBuilder sb = new StringBuilder();
//        sb.append("1");
//        sb.append("qw");
//
//        char[] chars = new char[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
//        chars[0] = 49;
//        chars[1] = 113;
//        chars[2] = 119;
//
//
//
//        char c = 0;
//
//        String sql = query.toString();
//
//
//
//
//
//        s = new String("s3");

//        User user1 = user;
////        user1.setName("test2");
//
//        Class<? extends User> aClass = user.getClass();
//
//        Field[] declaredFields = aClass.getDeclaredFields();
//        for (Field declaredField : declaredFields) {
//            System.out.println("declaredField = " + declaredField);
//            declaredField.setAccessible(true);
//            declaredField.set(user, "test3");
//        }

//        System.out.println("user = " + user);


        String q = " 12345  67890    ";

        System.out.println(MathStringUtil.isNumeric(q));

        System.out.println(q.matches("^[0-9]*"));

        System.out.println(q);
        System.out.println(q.trim());

        String[] s = q.trim().split("\\s+");
        for (String s1 : s) {
            System.out.println("s1 = " + s1);
        }

        String collect = Arrays.stream(s).collect(Collectors.joining(""));
        System.out.println("collect = " + collect);

        System.out.println("123".contains("l"));
        System.out.println("123".indexOf("2"));

        System.out.println("1123".startsWith("10"));
    }
}
