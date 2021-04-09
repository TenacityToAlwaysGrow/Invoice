/*
 * Assignment 1
 * Question 3
 * Jennifer Carr
 *  672 - 249317
 */

package assignoneques3;

/**
 * create a class called Invoice
 */

import java.util.Scanner;


public class Invoice_Test {

    public static void main(String[] args)
    {
      //declare invoice class
      Invoice orderInfo = new Invoice();

      //create a scanner object to obtain input
      Scanner input = new Scanner(System.in);

      //declare variables to hold values
      String number;
      int quantity;

      double price;



      //prompt user to provide item number
      System.out.print("Enter Number: ");
      number = input.nextLine();
      orderInfo.setPartNumber(number);

      //prompt user to enter the amount needed of the item
      System.out.print("Please enter the quantity you need for this item ");
      quantity = input.nextInt();

      //create a decision to set/get item quantity and the price for the item
        if (quantity > 0)
            orderInfo.setItemQuantity(quantity);

            System.out.print("Enter the price of the item ");
            price = input.nextDouble();

          //create decision to set/get and calculate the total price of invoice
            if(price > 0)
                orderInfo.setItemPrice(price);

              double invoiceAmount = orderInfo.getInvoiceTotal(quantity, price);

          

               System.out.printf ("The total amount owed is: = $" +invoiceAmount);

        }

   }
