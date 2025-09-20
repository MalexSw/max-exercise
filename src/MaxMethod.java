package com.epam.rd.autotasks.max;

public class MaxMethod {
    public static int max(int[] values) {
        int maxVal = values[0];
        for (int val : values) {
            if (val > maxVal) {
                maxVal = val;
            }
        }
        return maxVal;
    }
}
