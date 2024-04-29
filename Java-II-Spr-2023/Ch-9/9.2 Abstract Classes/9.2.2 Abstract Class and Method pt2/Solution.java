import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String model=s.nextLine();
        int speed=s.nextInt();
        
        Suzuki suzie= new Suzuki();
        System.out.println(suzie.getModel(model));
        System.out.println(suzie.getMaxSpeed(speed));
    }
}