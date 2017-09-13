package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b=0;
        int chislo=0;

        for (int i=1;i<=a;i++){

            if(i>b){
                chislo++;
                b=b+chislo;
            }

            System.out.print(chislo + " ");

        }

    }
}
