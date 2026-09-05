package com.kobakha;

public class Main {
    public static int x = 0;
    public static void main(String[] args) {
        int n=10;
        System.out.println("counter() = " + new Main().counter(n));
        System.out.println("counter() = " + new Main().counter(n));
        System.out.println("counter() = " + new Main().counter(n));
    }

    public int counter(int n) {
        n = n + x;
        x = x + 1;
        return n;
    }
}