package org.example.util;

public class SumAcc {

    public int reduce(int i) {
        int sum = 0, k = 0;

        while (k < i) {
            k = k + 1;
            sum = sum + k;
        }

        return sum;
    }
}
