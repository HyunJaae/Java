package com.devlee.time;

import java.util.Date;

public class TimeComplexity {

    public static int o1(int[] arrays, int index) {
        return arrays[index];
    }

    public static void on(int n) {
        for (int i = 0; i < n; i++) {
            // do something for 1 second
        }
    }

    public static void on2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // do something for 1 second
            }
        }
    }

    public static int fibonacci(int n) {
        if(n <= 1) {
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 1;
        int result = o1(arr, index);

        System.out.println(fibonacci(45));

        System.out.println(result);
    }
}
