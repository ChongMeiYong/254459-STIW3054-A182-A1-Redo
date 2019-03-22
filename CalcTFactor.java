
public class CalcTFactor extends TFactor{
	double rating,factor;
	double total=0,ttl=0,TCF=0;

	public void Multiply(double r, double f) {
		this.rating = r;
		this.factor = f;	
		total+=rating*factor;
	}
	
	CalcUseCase calUS = new CalcUseCase();
	public double getTFactor() {
		return ttl=calUS.getUCP()+total;	
	}
	
	public double getTCF() {
		return TCF=(ttl*0.01)+0.6;	
	}
	
	public double getSzUC() {
		return SwEstimation.UUCP*TCF;	
	}
}
