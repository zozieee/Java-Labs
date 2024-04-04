/******************************************************************************
Programmer: Zoe Cope 
Date: 08/30/2023
Lab 1
Instructor: Dr. Rafael Azuaje
College: San Antonio College or other from Alamo Colleges District

*******************************************************************************/

public class Employee implements DepartmentConstants, Displayable{
// implementing Displayable interface allows program to call getDisplayText() or toString() methods

    private int department;
    private String firstName;
    private String lastName;

    public Employee(int department, String lastName, String firstName) {
        this.department = department;
        this.lastName = lastName;
        this.firstName = firstName;
    }
    
    // overrides the toString() method of the Object class
    @Override
    public String toString() {
         String text = "";
         text += firstName +" " + lastName +" (";
         
         String dept = "";
         if (department==ADMIN){
            dept+= "Administration";
         }
         else if (department==EDITORIAL){
            dept+= "Editorial";
         }
         else if (department==MARKETING){
            dept+= "Marketing";
         }
         
         text += dept + ")";
         return text;    
         }
}