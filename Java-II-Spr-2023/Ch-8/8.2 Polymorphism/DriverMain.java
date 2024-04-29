import java.util.*;

public class DriverMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N1 = s.nextInt();
        int N2 = s.nextInt();
        int N3 = s.nextInt();
        ProblemSolution problemSolution = new ProblemSolution();
        System.out.println(problemSolution.solution(N1, N2));
        System.out.print(problemSolution.solution(N1, N2, N3));
    }
}