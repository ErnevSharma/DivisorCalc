public class DivisorCalc {
	public static void main(String [] args)
	{
		System.out.println(gcd(6,24));
	}
	
	public static int gcd(int num1, int num2)
	{
		if(num2 > num1)
			return gcd(num2, num1);
		if(num1%num2 == 0)
			return num2;
		else
			return gcd(num2, num1%num2);
		
	}
}