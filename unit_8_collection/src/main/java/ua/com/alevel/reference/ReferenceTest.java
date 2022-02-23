package ua.com.alevel.reference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReferenceTest {

    public void test() {
        IReference iReference1 = new IReference() {
            @Override
            public int plus10(int a) {
                return a + 10;
            }
        };
        IReference iReference2 = a -> a + 10;
        IReference iReference3 = this::plus10InCurrentClass; // 1
        IReference iReference4 = ReferenceUtil::plus10; // 2

        Integer[] ints = new Integer[] { 1, 9, 8, 67, 0, 45, 23, 9, 6, 67 };
        Collection<Integer> integers = Arrays.asList(ints);

        Stream<Integer> integerStream = integers.stream();

        List<Integer> resultList = integerStream
                .distinct()
                .filter(i -> i % 2 == 0)
                .sorted()
                .toList();
        System.out.println("resultList = " + resultList);

        String joinString = integers.stream()
                .distinct()
                .filter(i -> i % 2 == 0)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining());
        System.out.println("joinString = " + joinString);


        List<Customer> customers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            customers.add(new Customer("first" + i, "last" + i));
        }
        System.out.println("customers = " + customers);

        List<CustomerDto> customerDtoList = customers
                .stream()
                .map(c -> new CustomerDto(c.firstName() + " " + c.lastName()))
                .toList();

        System.out.println("customerDtoList = " + customerDtoList);

        customerDtoList = customers
                .stream()
//                .map((Customer cus) -> { return new CustomerDto(cus); }) // 3
                .map(CustomerDto::new) // 3
                .toList();

        System.out.println("customerDtoList = " + customerDtoList);

        List<String> names = customers
                .stream()
                .map(CustomerDto::new) // 4
                .map(CustomerDto::getFullName)
                .toList();
        System.out.println("names = " + names);
    }

    private interface IReference {

        int plus10(int a);
    }

    private int plus10InCurrentClass(int a) {
        return a + 10;
    }
}
