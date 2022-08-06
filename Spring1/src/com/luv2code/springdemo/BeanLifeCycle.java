package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext iocContainer =new ClassPathXmlApplicationContext("life-cycle-applicationContext.xml");

       TrackCoach coach= iocContainer.getBean("trackCoach", TrackCoach.class);
       coach.getFortune();
       iocContainer.close(); // triggers destroy method in each and every bean

    }
}
