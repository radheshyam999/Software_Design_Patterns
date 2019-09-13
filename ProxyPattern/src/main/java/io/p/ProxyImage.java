package io.p;

public class ProxyImage implements Image {
	private RealImage rimage;
	private String fileName;
	public  ProxyImage(String fileName) {
		this.fileName = fileName; 
	}
	
	
	
	
	
	
	public void dispay() {
	    if(rimage==null) {
	    	rimage = new RealImage(fileName);
	    }
	    rimage.dispay();
	}

}
