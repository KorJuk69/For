package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        for(int i=1000;i>=0;i--){

            int ur=a*i*i*i+b*i*i+c*i+d;
            if(ur==0){
                System.out.print(i + " ");
            }

        }

    }
}
