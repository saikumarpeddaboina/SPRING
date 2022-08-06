package com.luv2code.springdemo;

public class BaseBallCoach implements Coach {

    private final Fortune baseBallFortune;
    String teamName;

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTeamName() {
        return teamName;
    }

    public BaseBallCoach(Fortune baseBallFortune){
        this.baseBallFortune=baseBallFortune;
    }
    public String getDailyWorkOut(){
        return "Spend 30 minutes batting in nets";
    }

    @Override
    public void getFortune() {
        System.out.println("Baseball Coach Fortune is : "+baseBallFortune.getFortune());
    }

}
