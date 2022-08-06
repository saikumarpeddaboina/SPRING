package com.luv2code.springdemo;

public class MyApplication {
    public static void main(String[] args) {
        Coach coach=new TrackCoach();
        System.out.println(coach.getDailyWorkOut());
    }
}
