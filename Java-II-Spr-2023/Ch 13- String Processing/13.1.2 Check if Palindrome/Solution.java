import java.util.*;
import java.lang.String;

public class Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int message=1;
        String in=s.nextLine();
        StringBuilder test=new StringBuilder();
        test.append(in);    //puts input into string builder obj
        
        String match=test.toString();   
            
        String reverse=new StringBuilder(test).reverse().toString();
             
        if(reverse.equals(match)){
            System.out.print(1);
        }
        else{
            System.out.println(0);
        }
    }}

