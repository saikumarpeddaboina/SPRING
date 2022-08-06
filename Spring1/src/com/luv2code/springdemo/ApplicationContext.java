package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationContext {
    public static void main(String[] args) {
        // Configuring the Beans ( creating ) using applicationContext.xml file and Loading it
        ClassPathXmlApplicationContext iOCContainer =new ClassPathXmlApplicationContext("applicationContext.xml");

        BaseBallCoach baseBallCoach=iOCContainer.getBean("baseballCoach", BaseBallCoach.class); //Constructor Injection // Getting the bean By Name (id declared in applicationContext.xml file) and Casting it to type of BaseBallCoach.class
        BaseBallCoach baseBallCoach1=iOCContainer.getBean("baseballCoach", BaseBallCoach.class); //Constructor Injection // Getting the bean By Name (id declared in applicationContext.xml file) and Casting it to type of BaseBallCoach.class
        Coach trackCoach=iOCContainer.getBean("trackCoach", Coach.class); // Setter Injection // Getting the bean By Name (id declared in applicationContext.xml file) and Casting it to type of Coach.class
        CricketCoach cricketCoach=iOCContainer.getBean("cricketCoach", CricketCoach.class); // Constructor Injection
        CricketCoach cricketCoach1=iOCContainer.getBean("cricketCoach", CricketCoach.class); // Constructor Injection

        System.out.println(baseBallCoach.getDailyWorkOut());
        System.out.println(trackCoach.getDailyWorkOut());
        System.out.println(cricketCoach.getDailyWorkOut());


        // Singelton Scope
        System.out.println("Singelton Scope");
        System.out.println(cricketCoach.getTeamName()); // Getting Literal Values during bean Dependency Injection
        System.out.println(cricketCoach1.getTeamName());
        cricketCoach.setTeamName("RR"); // Scope is Default Singelton same object reference is shared between cricketCoach , cricketCoach1 setting in 1 of objects reflects in others
        System.out.println(cricketCoach.getTeamName()); // Scope is Default Singelton same object reference is shared between cricketCoach , cricketCoach1 setting in 1 of objects reflects in others
        System.out.println(cricketCoach1.getTeamName());

        // Prototype Scope
        // // Scope isPrototype different object references are shared between baseBallCoach , baseBallCoach1 setting in 1 of objects does not reflects in others.
        System.out.println("Prototype Scope");
        System.out.println(baseBallCoach.getTeamName());
        System.out.println(baseBallCoach1.getTeamName());
        baseBallCoach.setTeamName("Argentinas");
        System.out.println(baseBallCoach.getTeamName());
        System.out.println(baseBallCoach1.getTeamName());

    }
}
