import java.io.*;
import java.util.*;

public class ProblemSolution {
    public void solution(int[] A, int choice) {
        
        if (choice==0){
        insertionSort(A);
        }
        else if (choice==1){
            insertionDesc(A);
        }
        for (int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
       
    }
    public void insertionSort(int[] arr){
        int i,j,newValue;
        for(i=1;i<arr.length;i++){
            newValue=arr[i];
            j=i;
            while(j>0 && arr[j-1]>newValue){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=newValue;
        }
    }
    public void insertionDesc(int[] arr){
        int i,j,newValue;
        for(i=1; i<arr.length; i++){
            newValue=arr[i];
            j=i;
            while(j>0&& arr[j-1]<newValue){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=newValue;
        }
    }
}
