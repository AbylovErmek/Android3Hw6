package com.geektech.android3hw6;

public class Math {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) throws ArithmeticException {
        if (b == 0) return 0;
        return a / b;
    }

    public String[] reverseWords(String str) {
        int spaceCount = 0;
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        String[] res = new String[spaceCount + 1];
        for (int i = 0; i <= spaceCount; i++) {
            res[i] = str.split(" ")[spaceCount - i];
        }
        return res;
    }
}
