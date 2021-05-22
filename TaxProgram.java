/**
 * Course:      Data Structures and Algorithms for Language Processing WS 2015/2016
 * Assignment:  lab 3, exercise 2
 * Author:      Elizaveta Kornakova
 * Description: There are comments for the program below
 *
 * Honor Code:  I pledge that this program represents my own work.
 *              I received help from:
 *              (enter the names of others that helped with the assignment, or
 *              no one if you received no help)
 *              in designing and debugging my program.
 */

import java.util.Scanner;
public class TaxProgram
{
  public static final double LIMIT = 100.0; // fixed amount which we need for if-condition
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      System.out.println("Enter the price:");
      double price = keyboard.nextDouble();
      // user enters a price and the program reads it
      double tax = 0.0; 
      double total = 0.0;
      if (price >= LIMIT)
      {
        tax = price*0.05;
        total = price + tax;
        /* if the price is more or equals than the fixed amount then the program calculates the tax and the total
         price (the price + the tax) */     
      }
      else
      {
        total = price;
          /* if the price is less than the fixed amount then there's no tax and total just equals to the price */ 
      }
      System.out.print("Item cost:" + price + " ");
      System.out.print("Tax:" + tax + " ");
      System.out.println("Total:" + total);
      // printing all of the variables
    }
}