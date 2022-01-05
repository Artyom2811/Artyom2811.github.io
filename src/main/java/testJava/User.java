package testJava;

import org.springframework.stereotype.Component;

@Component
public class User {
    Integer id = 1;
    String firtName;
    String lastName;

    public User() {
    }

    public User(String firtName, String lastName) {
        this.firtName = firtName;
        this.lastName = lastName;
    }

    void doSmth() {}

    @Override
    public String toString() {
        return "PojoA{" +
                "id=" + id +
                ", firtName='" + firtName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
