package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int sum=0;

        for(int i=a;i<(a+100);i++){

            sum=sum+i;

        }

        System.out.print(sum);

    }
}
