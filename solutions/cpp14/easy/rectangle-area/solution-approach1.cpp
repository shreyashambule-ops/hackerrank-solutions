// ──────────────────────────────────────────────────
// Link        https://www.hackerrank.com/challenges/rectangle-area/problem?isFullScreen=true
// Problem     Rectangle Area
// Difficulty  Easy
// Subdomain   Inheritance
// Platform    HackerRank
// Language    cpp14
// Status      Accepted
// Submitted   2026-08-13, 05:14 p.m.
// ──────────────────────────────────────────────────


/*
 * Create classes Rectangle and RectangleArea
 */
 class Rectangle {
protected:
    int width;
    int height;

public:
    // Display method to print width and height
    virtual void display() const {
        cout << width << " " << height << endl;
    }
};
class RectangleArea : public Rectangle {
public:
    // Reads width and height from standard input
    void read_input() {
        cin >> width >> height;
    }

    // Overloaded display method to print the calculated area
    void display() const override {
        cout << width * height << endl;
    }
};


