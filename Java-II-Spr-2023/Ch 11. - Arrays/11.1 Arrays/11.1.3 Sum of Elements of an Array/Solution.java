import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size= s.nextInt();
        long sum=0;    
        
        int[] myArray=new int[size];
        
        for (int i=0; i<size; i++){
            myArray[i]=s.nextInt();
        }
        for (int num:myArray){
            sum += num;
        }
        System.out.print(sum);
    }
}