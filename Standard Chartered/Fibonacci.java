//find nth fibonacci number
import java.util.Scanner;
public class Fibonacci
{

public static int fib(int n)
{
	int a=1,b=1;
	for(int i=3;i<=n;i++)
	{
		int temp=b;
		b=a+b;
		a=temp;
	}
	return b;
}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fibonacci=fib(n);
		System.out.println(fibonacci);
		
		
	}

}
