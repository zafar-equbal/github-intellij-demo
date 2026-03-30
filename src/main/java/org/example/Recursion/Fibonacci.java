package org.example.Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(11));

    }

    public static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
