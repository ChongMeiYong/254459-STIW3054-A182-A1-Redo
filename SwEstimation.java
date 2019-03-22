import java.lang.Exception;

public class SwEstimation{
	static int totalA=0,UUCP;
	static double SzUC,MH,AdjustMH,UCP;
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Actor actor = new Actor();
		actor.access();
		totalA=actor.total;
		
		UseCase usecase = new UseCase();
		usecase.access();
		UUCP=usecase.uucp;
		
		TFactor tf = new TFactor();
		tf.access();
		SzUC=tf.szuc;
		
		EFactor ef =new EFactor();
		ef.run();
		UCP=ef.UCP;
		
		ManHours mh = new ManHours();
		mh.run();
		MH=mh.mhs;
		
		Adjust adj = new Adjust();
		adj.run();
		AdjustMH=adj.adjustMH;
		
		Report r = new Report();
		r.run();
	}
	
}
