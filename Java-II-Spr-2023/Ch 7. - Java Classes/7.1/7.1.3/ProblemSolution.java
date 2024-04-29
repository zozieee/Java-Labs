import java.util.*;

	class ProblemSolution{
    private String name, designation;    
    Scanner s = new Scanner(System.in);
        
        public String setName(){
            name=s.nextLine();
            return name;
        }
        public String setDes(){
            designation=s.nextLine();
            return designation;
        }
        public void solution(){
            System.out.println(name);
            System.out.println(designation);
        }    
}
class DriverMain{
    public static void main (String[] args)
    {    
       ProblemSolution problemSolution = new ProblemSolution();
        String name=problemSolution.setName();
        String designation=problemSolution.setDes();
       problemSolution.solution();    
}
}