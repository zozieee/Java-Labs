import java.util.*;

public class DriverMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i1,i2;
        float F1,F2;
        char C1,C2;
        int N = s.nextInt();    //first input==type
        
        ProblemSolution solution= new ProblemSolution();
        switch(N){
            case 1:
                i1=s.nextInt();
                i2=s.nextInt();
                System.out.print(ProblemSolution.solution(i1,i2));
                break;
            case 2:
               F1=s.nextFloat();
                F2=s.nextFloat();
                System.out.print(ProblemSolution.solution(F1,F2));
                break;
            case 3:
                C1=s.next().charAt(0);
                C2=s.next().charAt(0);
                System.out.print(ProblemSolution.solution(C1,C2));
                break;
        }
    }}