package Project1;
import java.util.*;
public class myClass1
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner s1=new Scanner(System.in);
		a=s1.nextInt();
		b=s1.nextInt();
		c=a*b;
		System.out.print("Output is " + c);
		s1.close();
	}
}
