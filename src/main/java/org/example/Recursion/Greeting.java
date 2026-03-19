package org.example.Recursion;

public class Greeting {
    public static void main(String[] args) {
        greet(5);

    }
    public static void greet(int n){
        if(n==0){
            return;
        }
        System.out.println("Hello Zafar");
        greet(n-1);
    }
}
