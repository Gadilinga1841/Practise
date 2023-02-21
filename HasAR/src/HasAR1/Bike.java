package HasAR1;

public class Bike {
	public String colour="while";
	public int price=98000;
	public Engine eg[];
	public Bike(Engine[] eg){
		this.eg=eg;
	}
	public void dis() {
		System.out.println(colour);
		System.out.println(price);
		
	
	for(Engine e:this.eg) {
		System.out.println(e.modal);
	}
	}

}

