import java.util.*;

public class Solution {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int GENDER= input.nextInt();
        int AGE= input.nextInt();
        
        int discount;
        
        if (GENDER==1) //male
        {
            if (AGE<=15)
            {
                discount=20;
            }
            else
            {
                discount=15;
            }
        }
        else //female
        {
            if (AGE<=15)
            {
                discount=30;
            }
            else
            {
                discount=25;
            }
        }
        
        System.out.println(discount);
    }
}