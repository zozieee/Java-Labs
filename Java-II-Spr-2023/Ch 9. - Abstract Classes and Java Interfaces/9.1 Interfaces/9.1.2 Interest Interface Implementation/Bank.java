public class Bank implements Interest{
    public int principal;
    public float year;
    double newRate=(rate/100.00);
    
    public double simpleInterest(){
        double interest1=((newRate*year)+1);
        double newAmt1=principal*(interest1);
        double simpInt=newAmt1-principal;
        //A=P(1+(r*t))
        return simpInt;        
    }
    public double compInterest(){
        //A=P(1+(r/n))^n*t
        double interest2=Math.pow((newRate+1),year);        
        double newAmt2=((principal)*(interest2));
        double compInt=newAmt2-principal;
        return compInt;
    }
    public Bank(int principal, float year){
       this.principal=principal;
       this.year=year;        
    }
}