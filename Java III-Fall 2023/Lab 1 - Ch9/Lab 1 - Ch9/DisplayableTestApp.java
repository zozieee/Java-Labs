/******************************************************************************
Programmer: Zoe Cope 
Date: 08/30/2023
Lab 1
Instructor: Dr. Rafael Azuaje
College: San Antonio College or other from Alamo Colleges District

*******************************************************************************/


public class DisplayableTestApp {

    public static void main(String args[]) {
        System.out.println("Welcome to the Displayable Test application\n");

        Displayable e = new Employee(2, "Smith", "John");  
        display(e); 
        //Creates and outputs information about an Employee object that is also a Displayable object     

        Displayable p = new Product("java", "Murach's Java Programming", 57.50);
        display(p);
        //Creates and outputs information about a Product object that is also a Displayable object     

        System.out.println();        
    }

    private static void display(Displayable d) {
        System.out.println(d.getDisplayText());
    }
}