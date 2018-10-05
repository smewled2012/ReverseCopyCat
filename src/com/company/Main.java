package com.company;
/*
* The program displays a multiple of 5 and 10
* the user enters a number and it displays all the numbers which are multiple of 5 and 7
* and asks if the user wants to enter another number */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String addNumber="";
        do{
            System.out.println("Enter a number please ?");
            int number = input.nextInt();
            for(int i=number;i>0;i--){
                // checks if a number is divisible by 5 or 7
                if(i%5==0|| i%7==0)
                    System.out.println(i);
            }
            input.nextLine();
            System.out.println("\nWould you like to enter another number (y/n) y");
            addNumber=input.nextLine();

            }while(addNumber.equalsIgnoreCase("y"));

        System.out.println("Thank You for Playing !");
    }


}
