package testJava;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class App {

    User a;

    @Autowired
    public void setA(User a) {
        this.a = a;
    }

    void print() {
        System.out.println(a);
    }

}
