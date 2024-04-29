import java.util.*;

class Person {
    private String name;
    Person(String s) {
        setName(s);
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}
class Employee extends Person {
    private int id;
    Employee(String sname, int id) //Constructor Method 
        {
            super(sname);
            setId(id);
        }
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return this.id;
    }
}
class HourlyEmployee extends Employee {
    private int hoursWorked, hourlyRate;
    HourlyEmployee(String NAME, int ID, int HR, int HW){
        super(NAME, ID);
        
        setHR(HR);
        setHW(HW);  
    }
    public void setHR(int HR){
           this.hourlyRate=HR;
    }
    public int getHR(){
        return this.hourlyRate;
    }
    public void setHW(int HW){
           this.hoursWorked=HW;
    }
    public int getHW(){
        return this.hoursWorked;
    }
    public int getGrosspay(){
        int Grosspay=((getHR())*(getHW()));
        return Grosspay;
    }    
}
class DriverMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String NAME = s.nextLine();
        int ID = s.nextInt();
        int HR = s.nextInt();
        int HW = s.nextInt();
        HourlyEmployee hourlyEmployee = new HourlyEmployee(NAME, ID, HR, HW);
        System.out.println(hourlyEmployee.getId());
        System.out.println(hourlyEmployee.getName());
        System.out.print(hourlyEmployee.getGrosspay());
    }
}