// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true
// Problem     Java Strings Introduction
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-22, 06:01 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int l = A.length()+ B.length();
        System.out.println(l);
        if(A.compareTo(B)<0){
            System.out.println("No");
        }
        else if(A.compareTo(B)==0){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
        
        
        String A2=A.substring(1,A.length());
        String B2=B.substring(1,B.length());
        
        System.out.println(Character.toUpperCase(A.charAt(0))+  A2 + " " +Character.toUpperCase(B.charAt(0)) + B2);
        
        
        
        
        
    }
}



