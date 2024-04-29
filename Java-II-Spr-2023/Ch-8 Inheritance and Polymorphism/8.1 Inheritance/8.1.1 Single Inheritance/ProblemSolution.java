import java.util.*;

class ProblemSolution extends Base {
    public long solution(int N1, int N2){
        
        long m1=addition(N1,N2);
        long m2=subtraction(N1,N2);
        
        long result=m1*m2;
        return result;
    }
}
class Base {
    public int addition(int N1, int N2) {
        int z = N1 + N2;
        return z;
    }
    public int subtraction(int N1, int N2) {
        int z = N1 - N2;
        return z;
    }
}

class DriverMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N1 = s.nextInt();
        int N2 = s.nextInt();
        ProblemSolution problemSolution = new ProblemSolution();
        System.out.print(problemSolution.solution(N1, N2));
    }
}