public class BankA extends Bank{
    @Override
    public double calculateSimpleInterest(double amount, int time){
        //A=P(1+r*t)
        double rate=.10;//ppa
        double newRate=((rate*time)+1);
        double newAmt=amount*newRate;
        
        double interest=newAmt-amount;
        return interest;
    }
}