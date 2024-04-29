import java.util.*;

class DriverMain{

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int principal = s.nextInt(); 
		float year = s.nextFloat();
		Interest bank = new Bank(principal, year);
		System.out.println(String.format("%.2f",bank.simpleInterest()));
		System.out.print(String.format("%.2f",bank.compInterest()));
	}
}
