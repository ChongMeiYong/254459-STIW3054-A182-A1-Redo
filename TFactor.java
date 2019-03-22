import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.Exception;

public class TFactor extends UseCase{
	int x=0,y=0;
	int TFactor[]=new int[13];
	double rating[] = new double[13];
	String desc[]= {"\t\t Have distributed solution\t\t\t","\t\t Respond specific performance\t\t\t",
					"\t\t Meet end-user efficiency\t\t\t","\t\t Complex internal processing\t\t\t",
					"\t\t Code must be reusable\t\t\t\t","\t\t Must be easy to install\t\t\t",
					"\t\t Must be easy to use\t\t\t\t","\t\t Must be portable\t\t\t\t",
					"\t\t Must be easy to change\t\t\t\t","\t\t Must allow concurrent users\t\t\t",
					"\t\t Includes special security features\t\t","\t\t Provide direct access for 3rd parties\t\t"
					,"\t\t Requires special user training facilities\t"};
	double factor[]= {2,1,1,1,1,0.5,0.5,2,1,1,1,1,1};
	double TF,TCF,szuc;
	Scanner scan = new Scanner(System.in);

	@Override
	public void access() throws Exception {
		//T Factor, Technical Complexity Factor, Size of Use Case
		System.out.println("\n");
		System.out.println("**Weighting Technical Factor**");
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("Technical Factor Description                                    Factor  Rating");
		System.out.println("------------------------------------------------------------------------------");
		
		CalcTFactor tf = new CalcTFactor();
		for(int i=0;i<=TFactor.length;i++) {
			do {
				try {
					System.out.print("T"+(i+1) +desc[i] +factor[i] +"\t");
					rating[i] = scan.nextDouble();
					if((rating[i]<0) || (rating[i]>5)) {
						x=1;
						throw new Exception("Wrong Input");
					}
					tf.Multiply(rating[i],factor[i]);
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
		TF=tf.getTFactor();
		System.out.printf("\nTotal T Factor = %.0f\n",TF);
		TCF=tf.getTCF();
		System.out.printf("Technical Complexity Factor = %.2f\n",TCF);
		szuc=tf.getSzUC();
		System.out.printf("Size of Use Case = %.2f\n",szuc);
		
	}

}
