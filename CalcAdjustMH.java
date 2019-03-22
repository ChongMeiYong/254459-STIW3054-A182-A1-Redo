
public class CalcAdjustMH extends Adjust {
	double percent,total=0;
	
	public void calculate(double p) {
		this.percent=p;
		total=(1+(percent/100))*SwEstimation.MH;
	}
	
	public double getAdjMH() {
		return total;
	}
}
