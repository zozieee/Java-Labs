import java.io.*;
import java.util.*;

public class ProblemSolution {
    public int solution(int[] A, int index) {
        int found= binarySearch(A, 0, (A.length-1), index);
        return found;  
    }
    public int binarySearch(int[] arr, int left, int right, int index){
        if (right>=left){
            int mid=left+(right-left)/2;
            
            if(arr[mid]==index){
                return mid;
            }
            if(arr[mid]>index){
                return binarySearch(arr, left, mid-1, index);
            }
            return binarySearch(arr, mid+1, right, index);
        }
        return -1;
    }
    
}
