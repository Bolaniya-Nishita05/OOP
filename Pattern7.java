import java.util.Scanner;

public class Pattern7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER NO.= ");
		int n=sc.nextInt();

		for(int i=n;i>0;i--)
		{
			for(int k=n;k>=i;k--)
			{
				System.out.print(" ");
			}

			for(int j=i;j>0;j--)
			{
				System.out.print("* ");
			}

			System.out.print("\n");
		}

		for(int i=0;i<n;i++)
		{
			for(int k=0;k<(n-i);k++)
			{
				System.out.print(" ");
			}

			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}

			System.out.print("\n");
		}
	}
}