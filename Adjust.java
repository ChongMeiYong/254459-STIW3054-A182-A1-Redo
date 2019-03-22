import java.util.Scanner;

public class Adjust extends ManHours {
	Scanner scan = new Scanner(System.in);
	double total=0,adjustMH;
	
	public void run() {
		//Adjusted Man-Hours
		System.out.print("Risk Coefficients(%) ： ");
		double percent = scan.nextDouble();
		CalcAdjustMH adjmh =new CalcAdjustMH();
		adjmh.calculate(percent);
		adjustMH=adjmh.getAdjMH();
		System.out.printf("Adjusted Man-Hours ： %.2f\n\n",adjustMH);
	}

}
