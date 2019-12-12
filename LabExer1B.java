import java.util.Scanner;
public class LabExer1B
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter an integer: ");
		int x = scan.nextInt();
		showNumberPlus10(x);
		showNumberPlus100(x);
		showNumberPlus1000(x);
		
		
		
	}
	
	public static int showNumberPlus10(int x)
	{
		return x + 10;
	}
	public static int showNumberPlus100(int y)
	{
		return y + 100;
	}
	public static int showNumberPlus1000(int z)
	{
		return z + 1000;
	}
}
