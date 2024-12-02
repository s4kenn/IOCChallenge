package org.aditya.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {

//        UserDataProvider mongoDBProvider = new MongoDB();
//        UserManager userManager = new UserManager(mongoDBProvider);
//        System.out.println(userManager.getInfo());

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        UserManager userManager = (UserManager) context.getBean("webServicesManager");
        System.out.println(userManager.getInfo());


    }

}
