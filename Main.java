package com.myfirstprogram;

public class Main {

    void myMethod(String fname,String lname){
        System.out.println(fname +" "+ lname);
    }
    //void myMethod(){
      //  System.out.println("hello");
    //}
    void add(int a, int b){
        System.out.println(a+b);
    }
    int add(int p, int q, int r, int s)
    {
        return p+q+r+s;
    }
    void add(float h, float i, float j)
    {
        System.out.println(h+i+j);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.myMethod("Anjana","Vaghasiya");

        //obj.myMethod();
        //int ans = obj.add(10,15);
        obj.add(10,20);
        //System.out.println(ans);

        int ans1 = obj.add(2,3,4,5);
        System.out.println(ans1);
        obj.add(5,6,7);
    }
}
