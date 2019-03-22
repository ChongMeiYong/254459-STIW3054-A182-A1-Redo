import java.util.Scanner;
import java.util.InputMismatchException;

public class UseCase extends Actor{
	int usecase[] =new int[3];
	String type [] = {"Simple","Average","Complex"};
	String desc [] = {"<3","4-7",">7"};
	int factor [] = {5,10,15};
	int ttlUC=0,y=0,total=0,uucp=0;
	
	Scanner scan = new Scanner(System.in);
	
	@Override
	public void access() throws Exception{
		//USE CASE 
		System.out.println("\n");
		System.out.println("**Weighting Use Case**");
		System.out.println("------------------------------------------------");
		System.out.println("Use Case Type  Description     Factor  Qty");
		System.out.println("------------------------------------------------");
		
		CalcUseCase calUS = new CalcUseCase();
		for(int i=0;i<usecase.length;i++) {
			do {
				try {
					System.out.print(type[i] +"\t\t" +desc[i] +"\t\t" +factor[i] +"\t" );
					int qty = scan.nextInt();
					calUS.Multiply(qty,factor[i]);
					y=1;
				}catch(InputMismatchException e) {
					System.out.println("===================Entered Wrong Input! Please Anter Again!===================");
					scan.next();
					y=2;
				}
			}while(y==2);
		}	
		total=calUS.getUCP();
		uucp=(total+SwEstimation.totalA);
		System.out.println("\nUse Case Point = "+uucp);
	}

}
