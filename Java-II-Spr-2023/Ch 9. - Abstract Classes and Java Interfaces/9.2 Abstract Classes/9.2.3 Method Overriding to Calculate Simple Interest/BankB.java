public class BankB extends Bank{
    @Override
    public double calculateSimpleInterest(double amount, int time){
        double rateB=.09;
        double newRateB=((rateB*time)+1);
        double newAmtB=amount*newRateB;
        
        double interestB=newAmtB-amount;
        return interestB;
    }
}