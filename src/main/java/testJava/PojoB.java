package testJava;

public class PojoB extends PojoA {

    public PojoB(String firtName, String lastName) {
        super(firtName, lastName);
    }

    void print(String text) {
        System.out.println(text);
    }
}
