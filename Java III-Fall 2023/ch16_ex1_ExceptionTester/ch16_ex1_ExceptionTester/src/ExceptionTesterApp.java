/******************************************************************************
Programmer: Zoe Cope
Date: 10/18/2023
Lab X8
Instructor: Dr. Rafael Azuaje
College: San Antonio College

*******************************************************************************/
import java.io.*;

public class ExceptionTesterApp {

    public static void main(String[] args) {
        System.err.println("In main: calling method1.");
        method1();
        System.err.println("In main: returned from method1.");
    }

    public static void method1(){
        //method 1 catches the FileNotFoundException
        try{
            System.err.println("\tIn method1: calling method2.");
            method2();
            System.err.println("\tIn method1: returned from method2.");
        } catch (FileNotFoundException e){
            System.err.println(e.toString());
        }
        
    }

    public static void method2() throws FileNotFoundException {
        System.err.println("\t\tIn method2: calling method3.");
        method3();
        System.err.println("\t\tIn method2: returned from method3.");
    }

    public static void method3() throws FileNotFoundException{
        System.err.println("\t\t\tIn method3: Entering.");

        //The following code throws the exception FileNotFoundException
        BufferedReader in= new BufferedReader(new FileReader("products.ran")) ;       
        System.err.println("\t\t\tIn method3: Exiting.");
    }
}
