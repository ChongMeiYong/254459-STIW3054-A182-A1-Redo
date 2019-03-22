import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Exception;

public class EFactor extends TFactor {
	int x=0,y=0;
	int EFactor[]=new int[8];
	double rating[] = new double[8];
	String des[]= {"\t\t\tFamiliar with FPT software process","\t\t\tApplication Experience\t\t",
				   "\t\t\tParadigm Experience\t\t","\t\t\tLead analyst capability\t\t",
				   "\t\t\tMotivation\t\t\t","\t\t\tStable Requirement\t\t","\t\t\tPart-time worker\t\t",
				   "\t\t\tDifficult of programming language"};
	double factor[]= {1,0.5,1,0.5,0,2,-1,-1};
	double EF,EFac,UCP;
	Scanner scan = new Scanner(System.in);
	
	public void run() {
		//E Factor, Experience Factor, Use Case Point
		System.out.println("\n");
		System.out.println("**Weighting Experience Factors**");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Experience Factor        Description                            Factor  Rating");
		System.out.println("------------------------------------------------------------------------------");
		
		CalcEFactor ef = new CalcEFactor();
		for(int i=0;i<=EFactor.length;i++) {
			do {
				try {
					System.out.print("E"+(i+1) +des[i] +"\t"+factor[i] +"\t");
					rating[i] = scan.nextDouble();
					if((rating[i]<0) || (rating[i]>5)) {
						x=1;
						throw new Exception("Wrong Input");
					}
					ef.Multiply(rating[i],factor[i]);
					x=0;y=0;
				}catch(InputMismatchException e) {
					System.out.println("===================Entered Wrong Input! Please Anter Again!===================");
					scan.next();
					y=2;
				}catch(Exception e) {
					System.out.println(" ");
				}
			}while(x==1||y==2);
		}
		EF=ef.getEFactor();
		System.out.printf("\nTotal E Factor = %.0f\n",EF);	
		EFac=ef.getEF();
		System.out.printf("Experience Factor = %.2f\n",EFac);
		UCP=ef.getUCP();
		System.out.printf("Use Case Point = %.3f\n\n",UCP);
	}

}
