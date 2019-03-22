import java.util.Scanner;

public class ManHours extends EFactor {
	int sum;
	double ER,mhs;
	Scanner scan = new Scanner(System.in);
	
	public void run() {
		//Man Hours FROM UCP
		
		System.out.print("Number of Factor Rating of E1-E6 below 3 : ");
		int num = scan.nextInt();
		System.out.print("Number of Factor Rating of E7-E8 above 3 : ");
		int num1 = scan.nextInt();
		CalcMH mh = new CalcMH();
		mh.Addition(num, num1);		
		mhs=mh.calcMH();
		System.out.printf("Total Man Hours ： %.3f\n\n",mhs);
	}
}
