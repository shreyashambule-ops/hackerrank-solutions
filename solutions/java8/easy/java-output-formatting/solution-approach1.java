// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-output-formatting/problem?isFullScreen=true
// Problem     Java Output Formatting
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java8
// Status      Accepted
// Submitted   2026-08-06, 11:38 a.m.
// ──────────────────────────────────────────────────

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                
                System.out.print(s1);
                for(int j=s1.length();j<15;j++){
                    System.out.print(" ");
                }
                if(x<100 && x>0){
                    System.out.print("0");
                }
                if(x==0){
                    System.out.print("00");
                }
                System.out.print(x);
                System.out.println();

                
            }
            
            System.out.println("================================");

    }
}



