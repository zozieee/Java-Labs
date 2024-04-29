import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        
        int rowInput=s.nextInt();
        int colInput=s.nextInt();
        int[][] myArray= new int[rowInput][colInput];
        
        for (int i=0; i<myArray.length; i++){
            for (int j=0; j<(myArray[i].length); j++){
                myArray[i][j]=s.nextInt();
            }
        } //assign elements in array
        
        for (int i=0; i<myArray.length; i++){
            for (int j=0; j<(myArray[i].length-1); j++){
                System.out.print(myArray[i][j]+" "); 
            }
            System.out.print(myArray[i][(colInput-1)]);
            System.out.print("\n");
        }    //display elements
    
    }
}