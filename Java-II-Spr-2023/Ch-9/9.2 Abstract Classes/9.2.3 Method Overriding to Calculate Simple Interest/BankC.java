public class BankC extends Bank{
    @Override
    public double calculateSimpleInterest(double amount, int time){
        double rateC=.07;
        double newRateC=((rateC*time)+1);
        double newAmtC=amount*newRateC;
        
        double interestC= newAmtC-amount;
        return interestC;
    }
}