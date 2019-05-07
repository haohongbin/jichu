package com.Class;

public class Test {
    public static void method(int mx){
        mx=20;
    }

    public static void main(String[] args){
        int x=10;
        method(x);
        System.out.println("x="+x);
    }
}
