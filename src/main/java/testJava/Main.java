package testJava;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class Main {

    public static void main(String[] args) throws IOException {
        ApplicationContext context = new AnnotationConfigApplicationContext("testJava");

        App app = (App)context.getBean("app");
        app.print();


    }
}