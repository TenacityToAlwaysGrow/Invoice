/*
 * Assignment 1
 * Question 3
 * Jennifer Carr
 * 672 - 249317
 */

package assignoneques3;

/**
 * class created for Invoice application
 *   Invoice class that contains name instance variables for the company name,
 *   parts, quantities order, prices and balance
 */



public class Invoice {

    //declarations
    private String partNumber;
    private String partName;
    private int itemQuantity;
    private double itemPrice;




    public void orderInfo (String number, String name, int quantity, double price)
      {
       partNumber = number;
       partName = name;
       itemQuantity = quantity;
       itemPrice = price;

      }

    //method to set part number
    public void setPartNumber (String number)
     {
      partNumber = number;
     }

     //method to get part number
     public String getPartNumber ()
      {
       return partNumber;
      }

     //method to set part name
     public void setPartName (String name)
      {
       partName = name;
      }

     //method to get part name - nothing passed
     public String getPartName ()
      {
       return partName;
      }

    //method to set quantity of item
     public void setItemQuantity(int quantity)
      {
       itemQuantity = quantity;
      }

     //method to get quantity of item - nothingn passed
     public int getItemQuantity()
      {
       return itemQuantity;
      }

     //method to set price of item
     public void setItemPrice(double price)
      {
       itemPrice = price;
      }

     //method to get price of item - nothing passed
     public double getItemPrice()
      {
       return itemPrice;
      }




         //method to calculate and get invoice amount
         public double getInvoiceTotal(int itemQuantity, double itemPrice)
          {
           double invoiceAmount;

           invoiceAmount = itemQuantity * itemPrice;

           return invoiceAmount;
          }
}


