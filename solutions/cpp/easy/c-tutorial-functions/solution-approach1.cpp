// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/c-tutorial-functions/problem?isFullScreen=true
// Problem     Functions
// Difficulty  Easy
// Subdomain   Introduction
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-08-12, 09:36 a.m.
// ──────────────────────────────────────────────────

#include <iostream>
#include <cstdio>
#include <algorithm> // Required for std::max
using namespace std;

int max_of_four(int a, int b, int c, int d) {
    return max({a, b, c, d});
}

int main() {
    int a, b, c, d;
    scanf("%d %d %d %d", &a, &b, &c, &d);
    int ans = max_of_four(a, b, c, d);
    printf("%d", ans);
    return 0;
}
