package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dharik Amin
 */
import java.util.Scanner;
import java.lang.*;
public class App 
{
    public static void main(String []args){

        Scanner st = new Scanner(System.in);
        System.out.println("Enter the length of the ceiling in feet: ");
        float length = st.nextFloat();

        System.out.println("Enter the width of the ceiling in feet: ");
        float width = st.nextFloat();

        float area = length * width;

        int result = (int) (Math.ceil(area / 350));
        int x = (int) area;
        System.out.println("You will need to purchase "+result+" gallons of paint to cover "+ x +" square feet");
    }
}
