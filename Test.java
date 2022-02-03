package com.myfirstprogram;

public class Test {

    public static void main(String[] args) {

       int data [][]= {{1,2,3,4},{5,6,7,8},{1,2,3,4},{5,6,7,8}};

       /* data[0][0]=5;
        data[0][1]=10;
        data[0][2]=15;
        data[0][3]=20;

        data[1][0]=25;
        data[1][1]=30;
        data[1][2]=35;
        data[1][3]=40;

        data[2][0]=45;
        data[2][1]=50;
        data[2][2]=55;
        data[2][3]=60;

        data[3][0]=65;
        data[3][1]=65;
        data[3][2]=65;
        data[3][3]=65;  */

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }

    }
}
