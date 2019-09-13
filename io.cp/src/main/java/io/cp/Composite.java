package io.cp;

public class Composite {
   public static void main(String...strings) {
	   Employee ceo  = new Employee("sunder","cio","$200000");
	   Employee haedaM  = new Employee("serg","Hm","$2000"); 
	   Employee SalesExcutive  = new Employee("jon","sales","$200");
	   Employee salesExcutre1  = new Employee("deep","sales","$200");
	   Employee clerk  = new Employee("nadim","clerk","$20");
	   Employee clerk1  = new Employee("nadim","clerk","$20"); 
       ceo.add(haedaM);
       haedaM.add(salesExcutre1);
       haedaM.add(SalesExcutive);
       salesExcutre1.add(clerk1);
       salesExcutre1.add(clerk);
       System.out.println(ceo);
      for(Employee head:ceo.getSub()){
    	  
    	  for(Employee s :head.getSub()) {
    		    System.out.println(s.toString()); 
    	           
    	     }
      }
      
   }
	
}
