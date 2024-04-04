/******************************************************************************
Programmer: Zoe Cope
Date: 10/04/2023
Lab 6
Instructor: Dr. Rafael Azuaje
College: San Antonio College

*******************************************************************************/

/**
 * GenericStackApp creates a Stack object and adds 3 items to the list
 * demonstrates all methods of Stack class: push, pop, peek, and size
 */
public class GenericStackApp {
    public static void main(String[] args) {
        Stack<String> s = new Stack<>();
        
        //push 3
        s.push("Apples");
        System.out.println("Push: Apples");
        s.push("Oranges");
        System.out.println("Push: Oranges");
        s.push("Bananas");
        System.out.println("Push: Bananas");
        
        System.out.println("The stack contains "+ s.size()+" items\n");
        
        //peek first
        System.out.println("Peek: "+ s.peek());
        System.out.println("The stack contains "+ s.size()+" items\n");
        
        //pop all
        System.out.println("Pop: "+ s.pop());
        System.out.println("Pop: "+ s.pop());
        System.out.println("Pop: "+ s.pop());
        
        System.out.println("The stack contains "+ s.size()+" items\n");

    }
    
}
