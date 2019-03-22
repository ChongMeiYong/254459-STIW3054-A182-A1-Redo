
public class CalcReport extends Report {
	int quantity,average;
	int total=0;
	
	public void Multiply(int q, int avg) {
		this.quantity=q;
		this.average=avg;
		total+=quantity*average;
	}
	
	public double getRManHours() {
		return total;
	}
	
	public double getLManHours() {
		return total+SwEstimation.AdjustMH;
	}

}
