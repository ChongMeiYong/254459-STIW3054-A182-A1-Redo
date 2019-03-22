
public class CalcActor extends Actor {
	int quantity,factor;
	int total=0;
	
	public void Multiply(int q, int f) {
		this.quantity = q;
		this.factor = f;	
		total+=quantity*factor;
	}
	
	public int getAP() {
		return total;	
	}
}
