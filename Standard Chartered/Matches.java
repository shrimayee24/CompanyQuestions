//find number of matches to play for N players if one player gets knocked out in each match
//if each player loses in a match-for n players,we require n-1 matches so that 1 player is left as the winner

import java.util.Scanner;

public class Matches 
{
	public static long numberOfMatches(long n)
	{
		return n-1;
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter players:");
		long n=sc.nextInt();
		long matches=numberOfMatches(n);
		System.out.println("Number of matches required:"+matches);

	}

}
