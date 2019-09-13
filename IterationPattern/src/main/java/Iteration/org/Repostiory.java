package Iteration.org;

public class Repostiory implements Container {
     public String Names[] = {"hello","jhgy","how","full of game"}; 
	
	
	
	public Iterator getItertor() {
		
		return new NameIterator();
	}     
    private class NameIterator implements Iterator{
    	 int index; 
		public boolean hasNext() {
			if(index<Names.length) {
				return true;
			}
			return false;
		}
        
		@SuppressWarnings("unused")
		public Object next() {
			 if(this.hasNext()) {
				 return Names[index++];
			    }
			
			
			
			
			return null;
		}
    	
    }
}
