package com.myfirstprogram;

public class Constructor {

        int z;
        public Constructor(int x, int y) {
            z=x+y;
        }
        public static void main(String[] args) {
            Constructor myObj = new Constructor(5,6);
            System.out.println(myObj.z);
        }
    }



