package testJava;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = List.of("Hello", "world");
        var list2 = list.stream().reduce((a, b) -> a + " " + b);
        System.out.println(list2.get());

    }
}