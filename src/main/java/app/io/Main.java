package app.io;
public class Main {
/**
 * this is abstract factory  design pattern 
 * 
 * 
 * **/
	public static void main(String[] args) {
//		LearnSiglton ob = LearnSiglton.getInstance();
//		ob.show();
//		LearnSiglton ob1 = LearnSiglton.getInstance();
//          ob1.show();
//          System.out.println(ob1==ob);
//          
	
		AbstractFactory  factor = CreatFactory.getFactory("color");
		 factor.getColor("Red").fill();
		factor.getColor("green").fill();

		 factor.getColor("Blue").fill();
		 AbstractFactory  factor1 = CreatFactory.getFactory("shape");
		 factor1.getShape("circle").drow();
		 factor1.getShape("Rectangle").drow();
		 factor1.getShape("Squre").drow();
	}

}
