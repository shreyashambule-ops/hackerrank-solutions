// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-string-reverse/problem?isFullScreen=true
// Problem     Java String Reverse
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-23, 11:46 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int l=A.length();
        int res=0;
        if(l%2==0){
            for(int i=0;i<l/2;i++){
                if(A.charAt(i)==A.charAt(l-i-1)){
                    res=1;
                }
                else{
                    res=0;
                }
            }
        }
        else if(l==1){
            res=1;
        }
        else{
            for(int i=0;i<l/2-1;i++){
                if(A.charAt(i)==A.charAt(l-i-1)){
                    res=1;
                }
                else{
                    res=0;
                }
        }
        }
        if(res==1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}



