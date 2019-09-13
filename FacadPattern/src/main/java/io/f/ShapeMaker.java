package io.f;

public class ShapeMaker {
    private Circle circle;
    private Squre squre;
    private Recatangle recatangle;
	public ShapeMaker() {
		circle     = new Circle();
		squre      = new Squre();
		recatangle = new Recatangle(); 
	}
	public void drawCircle() {
		circle.draw();
	}
	public void drawSqure() {
		squre.draw();
	}

	public void drawRecatangle() {
		recatangle.draw();
	}



}
