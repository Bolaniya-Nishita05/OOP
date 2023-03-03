import java.util.Scanner;

public class Pattern10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER NO.= ");
		int n=sc.nextInt();

		for(int i=0;i<n;i++)
		{
			for(int k=0;k<(n-i);k++)
			{
				System.out.print(" ");
			}

			for(int j=0;j<=2*i;j++)
			{
				if(j==0 || j==2*i)
				{
					System.out.print("*");
				}

				else
				{
					System.out.print(" ");
				}
			}

			System.out.print("\n");
		}

		for(int i=n-1;i>0;i--)
		{
			for(int k=n;k>=i;k--)
			{
				System.out.print(" ");
			}

			for(int j=2*i-1;j>0;j--)
			{
				if(j==2*i-1 || j==1)
				{
					System.out.print("*");
				}

				else
				{
					System.out.print(" ");
				}
			}

			System.out.print("\n");
		}
	}
}