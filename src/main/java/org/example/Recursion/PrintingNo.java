package org.example.Recursion;

public class PrintingNo {
    public static void number(int n){
        if(n==0) {
            return;
        }

            number(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        number(10);
    }
}
