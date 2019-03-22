import java.util.Scanner;
import java.util.InputMismatchException;

public class Actor extends SwEstimation{
	int actor[] =new int[3];
	String type [] = {"Simple","Average","Complex"};
	String desc [] = {"API","IP/TCP","GUI"};
	int factor [] = {1,2,3};
	int ttlAP=0,y=0,total,sum;
	Scanner scan = new Scanner(System.in);
	
	public void access() throws Exception{
		//ACTOR POINT
		System.out.println("**Weighting Actor**");
		System.out.println("----------------------------------------------");
		System.out.println("Actor Type     Description     Factor   Qty");
		System.out.println("----------------------------------------------");
		
		CalcActor calA = new CalcActor();
		for(int i=0;i<actor.length;i++) {
			do {
				try {
					System.out.print(type[i] +"\t\t" +desc[i] +"\t\t" +factor[i] +"\t" );
					int qty = scan.nextInt();
					
					calA.Multiply(qty,factor[i]);
					
					y=1;
				}catch(InputMismatchException e) {
					System.out.println("===================Entered Wrong Input! Please Anter Again!===================");
					scan.next();
					y=2;
				}
			}while(y==2);
		}	
		total=calA.getAP();
		System.out.println("\nTotal Actor Point = "+total);	
	}
}