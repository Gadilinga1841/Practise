package HasAR;
import HasAR1.*;

public class Test {

	public static void main(String[] args) {
	  Engine eg=new Engine("engine1");
	  Engine eg1=new Engine("engine2");
	  Engine eg2=new Engine("engine3");
	   Engine[] aeg= {eg,eg1,eg2};
	   Bike bk=new Bike(aeg);
	   bk.dis();
			  System.out.println("good bye");
	    
}   
}
