package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if(a%2==1){
            a++;
        }
        while(a<=b){
            System.out.print(a + " ");
            a = a + 2;
        }

    }
}
