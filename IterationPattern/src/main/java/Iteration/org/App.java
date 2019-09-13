package Iteration.org;

/**
 * Hello world!
 *
 */

/***
 *  this is itrator pattern :)
 * 
 * 
 * 
 * 
 *
 *
 *
 */


public class App 
{
    public static void main( String[] args )
    {
    	Repostiory repo = new Repostiory();
    	for (Iterator itr= repo.getItertor();  itr.hasNext();) {
			String name =(String) itr.next();
			System.out.println(name);
			
		}
    }
}

