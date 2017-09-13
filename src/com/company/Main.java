package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();
        int kol=0;

        for(int i=0;i<=1000;i++){

            int ur=a*i*i*i+b*i*i+c*i+d;
            if((ur==0)&&(i!=e)){
                kol++;
            }

        }
        System.out.print(kol);
    }
}
