// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true
// Problem     Java Loops II
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    java15
// Status      Accepted
// Submitted   2026-08-13, 05:42 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        double s;
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
           
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            s=a;
            
            
            
            for(int j=0;j<n;j++){
                s += (Math.pow(2,j))*b;
                int myInt = (int) s;
                System.out.print(myInt);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
    
}
