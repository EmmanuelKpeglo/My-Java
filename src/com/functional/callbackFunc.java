package com.functional;

interface dispo<A, B, R> {
    public R add (A arg1, B arg2);
}

public class callbackFunc {
    public static void main(String[] args) {

        dispo<Integer, Integer, Integer> abc = (n1, n2) -> n1 + n2;

        System.out.println(show(2, 98, abc));

    }

    static int show (int a, int b, dispo<Integer, Integer, Integer> func) {

        return func.add(a, b);
    }
}
