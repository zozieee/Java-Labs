import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int grade = s.nextInt();
        
        if (grade>=90){
            System.out.println("A");}
        else if (grade>=60 && grade<=89){
            System.out.println("B");}
        else if (grade>=30 && grade<=59){
            System.out.println("C");}
        else if (grade<30){
            System.out.println("D");}           
    }
}