package com.company;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.IOException;
import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
    /*
        int x;
        x = System.in.read();
        char c = (char) x;
        System.out.println(x +"="+ c);

        System.out.println("INPUT NAME :");
        Scanner scan = new Scanner(System.in);
       // scan = System.in;

        String name = scan.next();
        System.out.println("Hi" + name);
        scan.close();



        int a=7, b=2;
        System.out.println(a/b);


        int a=7;

        System.out.println(a++);
        System.out.println(++a);



        float d = 0.10f;
        double dd = .5;

        float x=0, y=0;
        x = (float) (0.3 + 0.4);
        y = 0.3f + 0.4f;
        System.out.println(x +"="+ y);
        System.out.println(x==y);


        int a = 7;
        double b = 0.0;
        double c = -0.0;
        double d = 2.5;
        double g = Double.NEGATIVE_INFINITY;

        System.out.println(a/b==Double.NEGATIVE_INFINITY);
        System.out.println(a/c==Double.NEGATIVE_INFINITY);
        System.out.println(b==c);
        System.out.println(d/0);
        System.out.println(g*0);


        char a = '1';
        char b = '\u0031';
        char c = 49;

        System.out.println(a+""+b+""+ c);

       // System.out.println("4/2= " + 4/2 == "4/2=2");

        String a = "a";
        String b = "a";
        System.out.println(a==b);

        a = "c";
        System.out.println(a==b);
        b ="c";
        System.out.println(a==b);




        byte b1=50, b2=-99;

        b1 += b2;

        System.out.println(b1);


        byte b1 = 50 , b2 = 100;
        // + for int
        byte k1 = (byte) (b1 + b2);

        System.out.println("k="+k1);




        int age = 7;
        String status;

        if(age>=3 && age <=6) {
            status = "D.S";
        }
        else if(age>6 && age <=17) {
            status = "School";
        }
        else if(age>17 && age <=22) {
            status = "University";
        }
        else if(age>22 && age <=60) {
            status = "Work";
        }
        else if(age>60 && age <=90) {
            status = "Free Life";
        }
        else status = "Reincarnation";

        System.out.println(status);



        int day = 6;

        switch(day) {
            case 1 :

            case 2 :

            case 3 :

            case 4 :

            case 5 :
                System.out.println("Work Day");
                break;
            case 6 :

            case 7 :
                System.out.println("WeekEnd");
                break;
            default:
                System.out.println("INCORECT DAY");
        }


        int n = 10;

        while (n>0){
            System.out.println("tick" + n);
            n--;
        }


        int i =100, j=200;

        while (++i<--j);

        System.out.println(""+i+" "+j);



        int n = -10;

        do {
            System.out.println("tick " + n);
            n--;
        } while(n>0);


        int n;
        for ( n=0;n<100;n++) {

            if (n % 2 == 0) {
                System.out.println(n);
            }
        }


        int n=0;
        while(n<=100){
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n++;
        }

        n=0;
        do {
            if (n % 2 == 0) {
                System.out.println(n);
            }
            n++;
        }        while(n<=100);


    int sum = 0;
        int nums[] = {1,2,3,4,5,6,7,8,9,10};

        for (int x : nums){
            System.out.println("Values is :" + x);
            sum += x;
        }
        System.out.println(sum);

        int sum=0;
        int sumRow[] = new int[3];
        int nums[][] = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                nums[i][j] = (i + 1) * (j + 1);
            }
        }
    int ii = 0;
        for(int x[]:nums){
            for(int y:x){
                System.out.println("Values "+y);
                sum += y;
                sumRow[ii] += y;
            }
            ii++;

        }

        System.out.println("SUM: "+ sum);

        for (int i = 0; i < 3; i++) {
            System.out.println("Line "+i+ " : "+sumRow[i]);

        }

        boolean t = true;
        first:{
            second:{
                third:{
                    System.out.println("before");
                    if(t) break second;
                    System.out.println("this wont execute");
                }
                System.out.println("this wont execute");
            }
            System.out.println("this ASB");
        }
        */

        int arr[] = new int[20];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = (j + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            if ((i+1)%3!=0) continue;
            System.out.println(arr[i]);
        }

    }
}
