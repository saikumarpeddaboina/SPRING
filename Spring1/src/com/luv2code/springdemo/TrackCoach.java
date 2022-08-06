package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    private Fortune fortune;

    public void setFortuneService(Fortune fortune) {
        this.fortune = fortune;
    }

    @Override
    public String getDailyWorkOut() {
        return "Spend Running On Track For 30 minutes";
    }

    @Override
    public void getFortune() {
        System.out.println("Track Coach Fortune is : "+fortune.getFortune());
    }

    public void initMethod(){
        // Init Method
        System.out.println("In Track Coach Init Method");
    }

    public void destroyMethod(){
        // Destroy Method
        System.out.println("In Track Coach Destroy Method");
    }
}
