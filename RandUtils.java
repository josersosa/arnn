import java.util.*;
import java.math.*;

public class RandUtils {

	private static Random rn = new Random();
	
	private RandUtils(){}
	
	public static float getRange(float lo , float hi)
	{
		if(lo >hi)
		{
			throw new IllegalArgumentException("lo > hi");
		}
		
		if(lo == Float.MIN_VALUE && hi == Float.MAX_VALUE)
		{
			return rn.nextFloat();
		}
		else
		{
			return rn.nextFloat()*(float)(Math.pow(-1,rn.nextInt()));
		}
	}
	
}

//SPraWdZmy CzY TO DziaLA
