package singlton;

public class LearnSiglton {

	private static LearnSiglton Instance =null;
	private LearnSiglton() {
		
	}
	public static LearnSiglton getInstance() {
		
		if(Instance==null) {
		   Instance = new LearnSiglton();
		   return Instance;
		}
		
		return Instance;
		
	}
	
	public void show() {
		System.out.println("Hello world game is start");
	}
	
	
}
