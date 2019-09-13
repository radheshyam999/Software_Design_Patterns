package CompostePattern.DecoraterPattern;

public abstract class ShapeDecoder implements Shape {
  private Shape ds;	
   public ShapeDecoder(Shape ds) {
	   this.ds = ds;
   }
	public void drow() {
		ds.drow();
	}
   
   
}
