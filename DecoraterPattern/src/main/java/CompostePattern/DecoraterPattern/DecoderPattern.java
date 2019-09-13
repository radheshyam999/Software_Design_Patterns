package CompostePattern.DecoraterPattern;

public class DecoderPattern {
public static void main() {
	Shape circle = new Circle();
	Shape rectangle = new Recateangle();
	Shape redcir = new RedShapeDecoder(new Circle()); 
	Shape redrect = new RedShapeDecoder(new Recateangle());
	circle.drow();
	rectangle.drow();
	redcir.drow();
	redrect.drow();
}
	
	
	
	
}