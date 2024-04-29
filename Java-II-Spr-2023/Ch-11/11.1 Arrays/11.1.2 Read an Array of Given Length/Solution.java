import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        int size=s.nextInt();
        int[] A=new int[size];
        
        for (int i=0; i<size; i++){
            A[i]=s.nextInt();
        }
        if (size!=0){    //prevents error if input is 0
            
            for (int i=0;i<(size-1);i++){
            System.out.print(A[i]+" ");
        }
        System.out.print(A[(size-1)]);
    }}
}