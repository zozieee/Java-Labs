import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int currentSpeed=s.nextInt();
        int newSpd=s.nextInt();
        
        Suzuki suzie = new Suzuki(currentSpeed);
        suzie.increaseSpeed(newSpd);
        System.out.println(suzie.currentSpeed);      
    }    
}