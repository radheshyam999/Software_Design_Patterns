package CompostePattern.DecoraterPattern;

public class RedShapeDecoder extends ShapeDecoder{

	public RedShapeDecoder(Shape ds) {
		super(ds);
		
	}
	public void setBorder(Shape ds) {
		System.out.println("Border color:Red");
	}

}
