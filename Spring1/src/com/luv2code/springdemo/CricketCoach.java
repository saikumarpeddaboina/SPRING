package com.luv2code.springdemo;

public class CricketCoach implements Coach{

    String teamName;

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    private Fortune cricketFortune;

    public CricketCoach(Fortune cricketFortune) {
        this.cricketFortune = cricketFortune;
    }

    public String getTeamName() {
        return teamName;
    }

    @Override
    public String getDailyWorkOut() {
        return "Spend Batting In Nets For 3 hours";
    }

    @Override
    public void getFortune() {
        System.out.println("Cricket Coach Fortune is : " +cricketFortune.getFortune());
    }

}
