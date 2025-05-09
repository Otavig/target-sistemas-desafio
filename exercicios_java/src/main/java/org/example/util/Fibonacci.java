package org.example.util;

public class Fibonacci {

    public int sequence(int n) {
        if (n <= 1) {
            return n;
        }
        return sequence(n - 1) + sequence(n - 2);
    }
}
