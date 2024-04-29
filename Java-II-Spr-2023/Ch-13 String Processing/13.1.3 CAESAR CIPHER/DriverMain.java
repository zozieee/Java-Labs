import java.io.*;
import java.util.*;
import java.lang.*;

public class DriverMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String S = s.nextLine();
        int K=s.nextInt();    //shift K letters
        ProblemSolution solution = new ProblemSolution();
        System.out.print(ProblemSolution.solution(S,K));
    }
}