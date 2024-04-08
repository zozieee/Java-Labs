import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N1=s.nextInt();
        int N2=s.nextInt();
        
        if (N1==5) {
            if (N2==2) {
                System.out.println(0);
            }
            else { //N2 !=2
                System.out.println(1);
            }
         }
        else //N1 !=5
         {
                if (N2==2) {
                    System.out.println(2);
                }
                else {
                    System.out.println(3);
                }
         }
    }
}