package org.example.BitManipulation;

import java.util.Scanner;
public class BitwiseAddition {

    public static int add(int x, int y){
        while(y !=0){
            int carry =x&y;
            x=x^y;
            y=carry <<1;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Number to be added :");
        int num1=input.nextInt();
        int num2=input.nextInt();

        System.out.println("The Summation is :"+add(num1,num2));
        input.close();
    }
}
