package ro.io.org;

public abstract class Shape {
	protected DrowApi Dapi;
	protected Shape(DrowApi Dapi ) {
		this.Dapi =Dapi;
	}
	public abstract void draw();
	
	
}
