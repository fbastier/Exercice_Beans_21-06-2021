package com.example.springapp;

import com.example.springapp.Model.Compagny;
import com.example.springapp.Model.Developper;
import com.example.springapp.Model.House;
import com.example.springapp.Model.Service;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.ls.LSOutput;

@SpringBootApplication
public class ProjetDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetDemoApplication.class, args);
        ApplicationContext cxt = new ClassPathXmlApplicationContext("spring-beans.xml");

        // Injection par Constructeur
        System.out.println("Injection par constructeur");

        House house = (House) cxt.getBean(("houseBean1"));
        House house1 = (House) cxt.getBean(("houseBean2"));

        System.out.println(house);
        System.out.println(house1);


        // Injection par modificateur
        System.out.println("Injection par modificateur");

        Compagny compagny = (Compagny) cxt.getBean("Compagny");
        Developper developper1 = (Developper) cxt.getBean("Developper1");
        Developper developper2 = (Developper) cxt.getBean("Developper2");

        System.out.println(compagny);
        System.out.println(developper1);
        System.out.println(developper2);


        // Injection avec utilisation d'un scope
        // singleton
        System.out.println("Injection avec utilisation d'un scope");
        System.out.println("Avec singleton");

        Service service = (Service) cxt.getBean("service");
        service.setMessage("Réalisé avec scope singleton");
        System.out.println(service.getMessage());

        Service service1 = (Service) cxt.getBean("service");
        System.out.println(service1.getMessage());


        // prototype
        System.out.println("Injection avec utilisation d'un scope");
        System.out.println("Avec prototype");

        Service service2 = (Service) cxt.getBean("service1");
        service2.setMessage("Réalisé avec scope prototype");
        System.out.println(service2.getMessage());

        Service service3 = (Service) cxt.getBean("service1");
        System.out.println(service3.getMessage());



    }
}
