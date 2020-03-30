package com.charwayh.domain;

import java.io.Serializable;

public class Team implements Serializable {
    private int tid;
    private String teamName;
    private String leagueName;
    private String tEnglishName;
    private String city;

    public Team() {
    }

    public Team(int tid, String teamName, String leagueName, String tEnglishName, String city) {
        this.tid = tid;
        this.teamName = teamName;
        this.leagueName = leagueName;
        this.tEnglishName = tEnglishName;
        this.city = city;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String gettEnglishName() {
        return tEnglishName;
    }

    public void settEnglishName(String tEnglishName) {
        this.tEnglishName = tEnglishName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Team{" +
                "tid=" + tid +
                ", teamName='" + teamName + '\'' +
                ", leagueName='" + leagueName + '\'' +
                ", tEnglishName='" + tEnglishName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
