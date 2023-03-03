import java.util.Scanner;

public class Pattern9
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

			if(i==n-1)
			{
				for(int j=0;j<2*n-1;j++)
				{
					System.out.print("*");
				}
			}

			else
			{
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
			}

			System.out.print("\n");
		}
	}
}