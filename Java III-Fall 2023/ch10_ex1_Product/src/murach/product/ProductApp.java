/******************************************************************************
Programmer: Zoe Cope 
Date: 09/05/2023
Lab 2
Instructor: Dr. Rafael Azuaje
College: San Antonio College 
*******************************************************************************/
package murach.product;

import murach.business.*;
import murach.db.*;
import murach.presentation.Console;

public class ProductApp {

    public static void main(String[] args) {
        // display a welcome message
        System.out.println("Weclome to the Product Selector");
        System.out.println();

        // perform 1 or more selections
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            String productCode =
                Console.getString("Enter product code: ");

            // get the Product object
            Product p = ProductDB.getProduct(productCode);

             // display the output
            System.out.println();
            System.out.println("SELECTED PRODUCT");
            System.out.println("Description: " + p.getDescription());
            System.out.println("Price:       " + p.getPriceFormatted());
            System.out.println();

            // see if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            System.out.println();
        }
    }    
}