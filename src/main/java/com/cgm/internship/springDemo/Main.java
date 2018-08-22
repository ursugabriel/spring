package com.cgm.internship.springDemo;

import com.cgm.internship.springDemo.service.PantsService;
import com.cgm.internship.springDemo.service.TshirtService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("=======================Prototype Scope=================================");
        TshirtService service = appContext.getBean("tshirtService", TshirtService.class);
        System.out.println(service);
        TshirtService service2 = appContext.getBean("tshirtService", TshirtService.class);
        System.out.println(service2);
        System.out.println(service.findAll().get(0));

        System.out.println("");
        System.out.println("");

        System.out.println("=======================Singleton Scope=================================");
        PantsService service1 = appContext.getBean("pantsService",PantsService.class);
        System.out.println(service1);
        PantsService service3 = appContext.getBean("pantsService", PantsService.class);
        System.out.println(service3);
        System.out.println(service1.findAll().get(0));

    }
}
