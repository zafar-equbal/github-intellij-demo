package org.example.Recursion;

public class PrintingNo {
    //Printing Number From 1 to n;
    public static void number(int n){
        if(n==0) {
            return;
        }
            number(n - 1);
        System.out.println(n);
    }

    //Printing Number From N to 1 (Reverse order)
    public static void numberReverse(int n){
        if(n==0) {
            return;
        }
        System.out.println(n);
        numberReverse(n - 1);
    }

    public static void main(String[] args) {
       // number(10);
        numberReverse(10);
    }
}
