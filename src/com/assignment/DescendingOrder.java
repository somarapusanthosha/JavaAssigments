package com.assignment;

import java.util.Scanner;

public class DescendingOrder {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two characters");
        char c1= sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        if (c1>c2)
            System.out.println(c2+" "+c1);
        else
            System.out.println(c1+ " "+c2);

    }
}
