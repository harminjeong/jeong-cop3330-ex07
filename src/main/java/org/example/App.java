/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Harmin Jeong
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        String inputLength = input.nextLine();

        System.out.print("What is the width of the room in feet? ");
        String inputWidth = input.nextLine();

        int length = Integer.parseInt(inputLength);
        int width = Integer.parseInt(inputWidth);
        int area = width*length;
        float meters = area * 0.09290304f;

        System.out.printf("You entered dimensions of %d feet by %d feet.\nThe area is\n%d square feet\n%.3f square meters",length,width,area,meters);
    }
}
