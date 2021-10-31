package testJava;

import java.util.Arrays;

public class MethodRefer {

public void app() {
    String[] arr = {"awd", "asd", "zxc"};
    Arrays.stream(arr).forEach(this::print1);
}

    public void print(String i) {
        System.out.println(i);
    }
    public void print1(String i) { System.out.println(i); }
    public void print2(String i) { System.out.println(i); }
}
