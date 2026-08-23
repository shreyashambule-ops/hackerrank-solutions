// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-biginteger/problem?isFullScreen=true
// Problem     Java BigInteger
// Difficulty  Easy
// Subdomain   BigNumber
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-08-23, 11:59 a.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BigInteger one=sc.nextBigInteger();
        BigInteger two=sc.nextBigInteger();
        System.out.println(one.add(two));
        System.out.println(one.multiply(two));
    }
}
