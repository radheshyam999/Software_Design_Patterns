package fog.co.ProtoType;

public abstract class Shape implements Cloneable {
     private String id;
     private String Type;
     abstract void drow();
     public String getId() {
        	return id;
         }
     public void setId(String id) {
	       this.id = id;
            }
     public String getType() {
	        return Type;
           }
     public void setType(String type) {
	          Type = type;
           }

       @Override
     public Object clone() {
	       Object clone =null;
	        try {
	    	    clone = super.clone();
	    	 }catch(Exception e) {
	    	    e.printStackTrace();
	        }
	   return clone;
	   }
}
