package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int pol=0, otr=0, nul=0;

        for(int i=0;i<n;i++){
            int x = scanner.nextInt();
            if(x>0){
                pol++;
            }
            else{
                if(x<0){
                    otr++;
                }
                else {
                    nul++;
                }
            }
        }

        System.out.print(nul + " " + pol + " " + otr);

    }
}
