package ua.com.alevel.map;

import ua.com.alevel.set.AuthUser;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {

    public void test() {
        Map<AuthUser, String> hashMap = new HashMap<>();
        hashMap.put(new AuthUser("email1", "id"), "1");
        hashMap.put(new AuthUser("email2", "id"), "1");
        hashMap.put(new AuthUser("email3", "id"), "1");
        hashMap.put(new AuthUser("email4", "id"), "1");

        for (Map.Entry<AuthUser, String> authUserStringEntry : hashMap.entrySet()) {
            System.out.println("key = " + authUserStringEntry.getKey());
        }

        System.out.println();
        Map<AuthUser, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(new AuthUser("email1", "id"), "1");
        linkedHashMap.put(new AuthUser("email2", "id"), "1");
        linkedHashMap.put(new AuthUser("email3", "id"), "1");
        linkedHashMap.put(new AuthUser("email4", "id"), "1");

        for (Map.Entry<AuthUser, String> authUserStringEntry : linkedHashMap.entrySet()) {
            System.out.println("key = " + authUserStringEntry.getKey());
        }

        System.out.println();
//        Map<AuthUser, String> treeMap = new TreeMap<>();
        Map<AuthUser, String> treeMap = new TreeMap<>(comparator());
        treeMap.put(new AuthUser("email2", "id"), null);
        treeMap.put(new AuthUser("email1", "id"), null);
        treeMap.put(new AuthUser("email4", "id"), null);
        treeMap.put(new AuthUser("email3", "id"), null);

        for (Map.Entry<AuthUser, String> authUserStringEntry : treeMap.entrySet()) {
            System.out.println("key = " + authUserStringEntry.getKey());
        }
    }

    private Comparator<AuthUser> comparator() {
        return new Comparator<AuthUser>() {
            @Override
            public int compare(AuthUser o1, AuthUser o2) {
                return 0;
            }
        };
    }
}
