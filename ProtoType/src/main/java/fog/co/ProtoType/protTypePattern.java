package fog.co.ProtoType;


public class protTypePattern {
 public static void main(String...strings) {
 	  ShapeCache.LoadCache();
	  Shape loadcache = ShapeCache.getShape("1");
	  System.out.println(loadcache.getId());
	  Shape loadcache2 = ShapeCache.getShape("2");
	  System.out.println(loadcache2.getId());
	  Shape loadcache3 = ShapeCache.getShape("2");
	  System.out.println(loadcache3.getId());
 }
}
