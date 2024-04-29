import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        try{
            String S = s.nextLine();
            System.out.print('\"'+S+'\"');
        } catch (NoSuchElementException e){
            System.out.print("\""+"\"");
        }
     }
}