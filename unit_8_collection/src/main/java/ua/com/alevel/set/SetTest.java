package ua.com.alevel.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;

public class SetTest {

    public void test() {
        String id = UUID.randomUUID().toString();
        Set<AuthUser> authUsers = new HashSet<>();
        authUsers.add(new AuthUser("email1@mail.com", id));
        authUsers.add(new AuthUser("email2@mail.com", id));
        authUsers.add(new AuthUser("email3@mail.com", id));
        authUsers.add(new AuthUser("email4@mail.com", id));
        authUsers.add(new AuthUser("email5@mail.com", id));
        authUsers.forEach(System.out::println);

        System.out.println();

        Set<AuthUser> authUsersLinked = new LinkedHashSet<>();
        authUsersLinked.add(new AuthUser("email1@mail.com", id));
        authUsersLinked.add(new AuthUser("email2@mail.com", id));
        authUsersLinked.add(new AuthUser("email3@mail.com", id));
        authUsersLinked.add(new AuthUser("email4@mail.com", id));
        authUsersLinked.add(new AuthUser("email5@mail.com", id));
        authUsersLinked.forEach(System.out::println);


    }
}
