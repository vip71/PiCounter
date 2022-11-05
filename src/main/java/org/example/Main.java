package org.example;

import java.security.SecureRandom;

import static java.lang.Math.*;

public class Main {
    static double a=0,b=2,M=2;

    public static void main(String[] args) {
        SecureRandom random=new SecureRandom();
        for(int i=50;i<=5000;i+=50)
        {
            System.out.print(i);
            for(int j=0;j<50;j++)System.out.print(";"+ countPi(i,random));
            System.out.println();
        }
    }

    static double countPi(int precision, SecureRandom random)
    {
        double x,y;

        int sum=0;
        for(int i=0;i<precision;i++) {
            x = a+random.nextDouble() * (b - a);
            y = random.nextDouble() * (M);
            if(function(x,y)) sum++;
        }
        return (b-a)*abs(M)*sum/precision;
    }

    static boolean function(double x,double y)
    {
        return x*x+y*y<4;
    }
}