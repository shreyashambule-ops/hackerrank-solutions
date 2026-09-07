// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/java-list/problem?isFullScreen=true
// Problem     Java List
// Difficulty  Easy
// Subdomain   Data Structures
// Platform    HackerRank
// Language    java
// Status      Accepted
// Submitted   2026-09-07, 12:16 p.m.
// ──────────────────────────────────────────────────

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        
        int q = sc.nextInt();
        
        for (int j = 0; j < q; j++) {
            String t = sc.next(); // Changed from nextLine() to next()
            
            if (t.equals("Insert")) { // Changed == to .equals()
                int f = sc.nextInt();
                int s = sc.nextInt();
                a.add(f, s);
            } else {
                int d = sc.nextInt();
                a.remove(d); // Removed fixed index 0, now removes index d
            }
        }
        
        // Print modified list
        for (int num : a) {
            System.out.print(num + " ");
        }
        
        sc.close();
    }
}
