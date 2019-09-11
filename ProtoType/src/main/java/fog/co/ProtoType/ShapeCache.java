package fog.co.ProtoType;
import java.util.Hashtable;
public class ShapeCache {
	private static Hashtable<String,Shape> shapemap = new Hashtable<String,Shape>();
	public static Shape getShape(String shapid) {
		Shape Cachedshape =shapemap.get(shapid);
		
		return (Shape) Cachedshape.clone();
	}
  public static void   LoadCache() {
	  Rectangle rectangle = new Rectangle();
	  rectangle.setId("rectangle");
	  shapemap.put(rectangle.getId(), rectangle);
	  Squre squre = new Squre();
	  squre.setId("Squre");
	  shapemap.put(squre.getId(), squre);
	  Circle circle = new Circle();
	  circle.setId("Circle");
	  shapemap.put(circle.getId(), circle);
	  rectangle.drow();
	  squre.drow();
	  circle.drow();
	  
   }
	
	
}
