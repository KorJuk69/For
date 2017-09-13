package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nul=0;

        for(int i=0;i<n;i++){
            int x = scanner.nextInt();
            if(x==0){
                nul++;
            }
        }

        if(nul==0){
            System.out.print("NO");
        }
        else {
            System.out.print("Yes");
        }

    }
}
