
package io.p;

public class RealImage implements Image {
    String fileName;
	public RealImage(String fileName) {
    	 this.fileName= fileName;
    	 loadFromDisk(fileName);
    }
	public void dispay() {
		System.out.println("RealImage::diasplay()");
		
	}
	
	
public void loadFromDisk(String fileName) {
	
	System.out.println("Loding..."+fileName);
	
}
 }
