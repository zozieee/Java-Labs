import java.util.*;

public class Library {
    int acc_num;
    String title, author;
    
    public void setValues(int int1, String string1, String string2){
         acc_num=int1;//
         title=string1;
         author=string2;
    }
    public int compute(int ld){//accepts late days calculates $2/day fine
        int fine= ld*2;
        return fine;
    }
    public void display(){
        System.out.println(acc_num+" "+title+" "+author);        
    }
}