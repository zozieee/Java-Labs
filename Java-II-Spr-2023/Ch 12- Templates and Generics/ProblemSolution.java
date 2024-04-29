import java.util.*;

public class ProblemSolution extends DriverMain{
    Scanner s=new Scanner(System.in);
    public static int solution(int i1, int i2) {
      
                if (i1>i2){
                    return i1;
                }
                else{
                    return i2;
                }
    }
    public static float solution(float F1, float F2){
            
        if (F1>F2){
            return F1;
        }
        else{
            return F2;
        }}
    
    public static char solution(char C1, char C2){
        if(C1>C2){
            return C1;
        }
        else{
            return C2;
        }
    }
}
