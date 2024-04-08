/******************************************************************************
Programmer: Zoe Cope
Date: 10/04/2023
Lab 6
Instructor: Dr. Rafael Azuaje
College: San Antonio College

*******************************************************************************/
import java.util.*;

/**
 * list holds elements in stack
 * @param <E> is an element to be added to the stack
 */
public class Stack<E> {
    LinkedList<E> list = new LinkedList<E>();
    
    /**
     *
     * @param s is stack object that contains list
     */
    public void push(E s){
        list.addFirst(s);
    }
    /**
     *
     * @return pops an item from top of list and removes it
     */
    public E pop(){
        return list.removeFirst();
    }
    /**
     *
     * @return  first item of list w/o removing
     */
    public E peek(){
        return list.getFirst();   
    }
    /**
     *
     * @returns number of elements in stack
     */
    public int size(){
        return list.size();   
    }
}
