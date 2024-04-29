import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int choice=s.nextInt();
        double amount=s.nextDouble();
        int time=s.nextInt();
        
        if (choice==1) {
            BankA a=new BankA();
            System.out.println(a.calculateSimpleInterest(amount, time));
        }
        else if (choice==2)
        {
            BankB b=new BankB();
            System.out.println(b.calculateSimpleInterest(amount, time));
        }
        else if (choice==3)
        {
            BankC c=new BankC();
            System.out.println(c.calculateSimpleInterest(amount, time));
        }
        
    }
}