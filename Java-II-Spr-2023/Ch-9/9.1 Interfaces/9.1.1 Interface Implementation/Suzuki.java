public class Suzuki implements Car{
    public void displaySpeed(){
        System.out.println(currentSpeed);
    }
    public void increaseSpeed(int newSpd){
        currentSpeed=currentSpeed+newSpd;
    }
    public int currentSpeed;
    public Suzuki(int spd){
        currentSpeed=spd;
    }    
}