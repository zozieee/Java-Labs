import java.util.*;
import java.lang.*;

public class ProblemSolution {         

	public long solution(int N1, int N2){
       long L1=N1;
        long L2=N2;
        long result1=(L1+L2);
        
        return result1;
    }
    public long solution(int N1, int N2, int N3){
        long result2=(solution(N1,N2)+N3);
        return result2;
    }

}
