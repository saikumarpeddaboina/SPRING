package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionDI {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext iocContainer =new ClassPathXmlApplicationContext("applicationContext.xml");

        CricketCoach cricketCoach=iocContainer.getBean("cricketCoach", CricketCoach.class);
        BaseBallCoach baseBallCoach=iocContainer.getBean("baseballCoach",BaseBallCoach.class);
        TrackCoach trackCoach=iocContainer.getBean("trackCoach",TrackCoach.class);
        System.out.println(baseBallCoach.getDailyWorkOut());
        baseBallCoach.getFortune();

        System.out.println(cricketCoach.getDailyWorkOut());
        cricketCoach.getFortune();

        System.out.println(trackCoach.getDailyWorkOut());
        trackCoach.getFortune();
        System.out.println(cricketCoach.getTeamName()); //

    }
}
