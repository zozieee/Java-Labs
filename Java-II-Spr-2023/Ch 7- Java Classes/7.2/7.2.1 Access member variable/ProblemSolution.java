public class ProblemSolution {
    
    public static int solution() {
        int rollNumber=10001;
        Student aStudent=new Student(rollNumber);
        return aStudent.getRollNumber();
        
    }
    public static void main (String args[])
    {
        int rollNumber=solution();
        System.out.println(rollNumber);
    }
}