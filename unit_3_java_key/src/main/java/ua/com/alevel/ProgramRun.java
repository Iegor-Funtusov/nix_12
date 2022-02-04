package ua.com.alevel;

import org.apache.commons.lang3.StringUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ProgramRun {

    public static void start() {
        System.out.println("Welcome to unit 3 program");
        System.out.println("Please enter!");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String line = reader.readLine();
            while (true) {
                System.out.println();
                navigation();
                caseLogic(reader);
            }
        } catch (Exception e) {
            System.out.println("error: " + e);
        }
    }

    private static void navigation() {
        System.out.println("If you want overview circle, please enter 1");
        System.out.println("If you want overview check, please enter 2");
        System.out.println("If you want exit, please enter 0");
    }

    private static void caseLogic(BufferedReader reader) throws IOException {
        String line = reader.readLine();
        switch (line) {
            case "1" -> circle();
            case "2" -> check(reader);
            case "0" -> System.exit(0);
        }
    }

    private static void circle() {
        System.out.println("ProgramRun.circle start");
        List<String> stringList = Arrays.asList("1", "2", "3");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println("i = " + stringList.get(i));
        }
        String[] stringArr = new String[]{"1", "2", "3"};
        for (int i = 0; i < stringArr.length; i++) {
            System.out.println("i = " + stringArr[i]);
        }
        for (String s : stringArr) {
            System.out.println("s = " + s);
        }
        Iterator<String> iterator = stringList.listIterator();
        while (iterator.hasNext()) {
            System.out.println("iterator = " + iterator.next());
        }
        stringList.forEach(System.out::println);
        System.out.println();

        int index = 0;
        while (index < stringArr.length) {
            System.out.println("stringArr = " + stringArr[index]);
            index++;
        }

        do {
            System.out.println("in do");
        } while (false);

        System.out.println("ProgramRun.circle finish");
        System.out.println();
    }

    private static void check(BufferedReader reader) throws IOException {
        System.out.println("ProgramRun.check start");
        System.out.println("please enter something name:");
        String name = reader.readLine();
        if (StringUtils.isNotBlank(name)) {
            if (name.length() < 3 || name.length() > 10) {
                System.out.println("incorrect name");
            }
            if (!name.matches("^[A-Za-z]*")) {
                System.out.println("incorrect name");
            }
        } else {
            System.out.println("incorrect name");
        }

        System.out.println();

        System.out.println("please enter document status:");

        String docStatus = reader.readLine();
        DocumentStatus documentStatus = DocumentStatus.valueOf(docStatus);
        switch (documentStatus) {
            case LOADED -> {
                System.out.println("document LOADED");
            }
            case REVIEW -> {
                System.out.println("document REVIEW");
            }
            case APPROVED -> {
                System.out.println("document APPROVED");
            }
            case REJECT -> {
                System.out.println("document REJECT");
            }
            default -> System.out.println("document not found");
        }

        System.out.println("ProgramRun.check finish");
    }

    private enum DocumentStatus {

        LOADED, REVIEW, APPROVED, REJECT
    }
}
