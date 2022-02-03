package com.myfirstprogram;

public class CompanyTest {

    public static void main (String args[]){
        Company cp = new Company();
        cp.setName("Unify");
        System.out.println(cp.getName());

        cp.setTotalEmp(200);
        System.out.println(cp.getTotalEmp());

        cp.setBudget(30000);
        System.out.println(cp.getBudget());

        cp.setProjects("Testing");
        System.out .println(cp.getProjects());

    }
}
