package org.aditya.autowire.type;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

//        Specification mySpec = new Specification();
//        mySpec.setMake("Toyota");
//        mySpec.setModel("Corolla");
//        Car myCar = new Car(mySpec);
//        System.out.println(myCar.details());

        ApplicationContext context = new ClassPathXmlApplicationContext("carAutowireType.xml");
        Car myCar = (Car) context.getBean("myCar");
        System.out.println(myCar.details());


    }

}
