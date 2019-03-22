import java.util.Scanner;
import java.util.InputMismatchException;

public class Report extends Adjust {
	int report[] =new int[3];
	String type [] = {"Simple","Average","Complex"};
	int average [] = {12,20,40};
	int y=0;
	double lmh,rmh;
	Scanner scan = new Scanner(System.in);
	
	public void run() {
		//Final Man-Hours
		System.out.println("\n**Weighting Report**");
		System.out.println("------------------------------------------------");
		System.out.println("Report Type  Average Man-Hours  Qty");
		System.out.println("------------------------------------------------");
		
		CalcReport r = new CalcReport();
		do {
			try {
				for(int i=0;i<report.length;i++) {
					System.out.print(type[i] +"\t\t" +average[i] +"\t\t" );
					int qty = scan.nextInt();
					r.Multiply(qty,average[i]);
					
				}
			}catch(InputMismatchException e) {
				System.out.println("===================Entered Wrong Input! Please Anter Again!===================");
				scan.next();
				y=2;
			}
		}while(y==2);
		rmh=r.getRManHours();
		System.out.println("\nTotal Report Man-Hours = "+rmh);
		lmh = r.getLManHours();
		System.out.printf("Total Man Hours ： %.2f\n",lmh);
	}

}
