package ro.io.org;

public class Circle extends Shape {
    private int radius,x,y; 
	public Circle(int radius, int x,int y ,DrowApi Dapi) {
		super(Dapi);
		this.radius =radius;
		this.x =x;
		this.y =y;
				
	}

	@Override
	public void draw() {
		Dapi.drawCircle(radius, x, y);
		
	}

}
