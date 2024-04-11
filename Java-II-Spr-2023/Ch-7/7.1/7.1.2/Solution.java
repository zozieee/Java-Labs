import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        Library library= new Library();//creates new library object
        int acc_num = s.nextInt();
        String newLine=s.nextLine();//scanner exception w/o line 9
        String title = s.nextLine();
        String author = s.nextLine();
        int ld = s.nextInt();
        int fine=library.compute(ld);
        
        library.setValues(acc_num, title, author);        
        library.display();
        System.out.println(fine);
    }}