package fog.co.DesginPattern;
import haver.io.*;
/**
 * Hello world! 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Shape sh =FactorPattern.getShape("circle");
          sh.show();
          Shape sh1 =FactorPattern.getShape("Squre");
          sh1.show();
          Shape sh2 =FactorPattern.getShape("conic");
          sh2.show();

    
    }

	public int add(int i, int j) {
		// TODO Auto-generated method stub
		return i+j;
	}
}
