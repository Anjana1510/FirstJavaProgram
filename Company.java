package com.myfirstprogram;

public class Company {

    public int totalEmp;
    public String name;
    private int budget;
    private String projects;

    public void setTotalEmp(int totalEmp){
        this.totalEmp=totalEmp;
    }public int getTotalEmp(){
        return totalEmp;
    }

    public void setName(String name) {
        this.name = name;
    }public String getName() {
        return name;
    }

    public void setBudget(int budget){
        this.budget=budget;
    }public int getBudget(){
        return budget;
    }

    public void setProjects(String projects){
        this.projects=projects;
    }public String getProjects(){
        return projects;
    }
}

