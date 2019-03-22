
public class CalcUseCase extends UseCase{
	int quantity,factor;
	int total=0;

	public void Multiply(int q, int f) {
		this.quantity = q;
		this.factor = f;	
		total+=quantity*factor;
	}

	public int getUCP() {
		return total;
	}
}
