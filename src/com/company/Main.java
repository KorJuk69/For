package com.company;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        while (a<=b){

            int c = (int)sqrt(a);
            if(c*c==a){
                System.out.print(a + " ");
            }
            a++;

        }

    }
}
