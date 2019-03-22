
public class CalcMH extends ManHours{
	int num,num1;
	double ER,total=0;
	int sum=0;
	
	public void Addition(int n, int n1) {
		this.num = n;
		this.num1 = n1;	
		sum=num+num1;
		
		if(sum>0 && sum<=2) { 
			ER = 20;
		}
		else if(sum>2 && sum<=4) {
			ER = 28;
		}
		else if(sum>=5) {
			System.out.println("Please restructing the project team to fall the number at least 5.");
			ER=0;
		}
		else {
			ER=0;
		}
	}

	public double calcMH() {
		return total=ER*SwEstimation.UCP;
	}
	
	public double getMH() {
		return total;
	}
}
