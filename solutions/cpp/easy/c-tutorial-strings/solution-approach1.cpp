// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/c-tutorial-strings/problem?isFullScreen=true
// Problem     Strings
// Difficulty  Easy
// Subdomain   Strings
// Platform    HackerRank
// Language    cpp
// Status      Accepted
// Submitted   2026-08-12, 09:56 a.m.
// ──────────────────────────────────────────────────

#include <iostream>
#include <string>
using namespace std;

int main() {
	string a;
    string b;
    
    cin >> a;
    cin >> b;
    
    cout << a.length() << " " << b.length() <<endl ;
    
    cout << a+b << endl;
    
    int temp=a.at(0);
    a.at(0)=b.at(0);
    b.at(0)=temp;
    
    cout << a << " " << b;
    
  
    return 0;
}
