package com.company;
/*
* The program displays a number in descending order
* and if the number is multiple of 5 it replaces it with Copy
* if it is by 7 replaces it with Cat
 * and finally if the number is multiple of both 5 and 7 it replaces it with a word CopyCat
 * */

import java.util.Scanner;

public class ModifiedWeek3 {

    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    String addNumber="";

        do{
        System.out.println("Enter a number please ?");
        int number = input.nextInt();
        // input.nextLine();

        for(int i=number;i>0;i--){
            // checks if a number is divisible by 5 or 7
            if(i%5==0 && i%7==0)
                System.out.println("CopyCat");
            else if(i%5==0)
                System.out.println("Copy");
            else if(i%7==0)
                System.out.println("Cat");
            else
                System.out.println(i);
        }
        input.nextLine();
        System.out.println("\nWould you like to enter another number (y/n) y");
        addNumber=input.nextLine();

    }while(addNumber.equalsIgnoreCase("y"));

        System.out.println("Thank You for Playing !");
}


}


