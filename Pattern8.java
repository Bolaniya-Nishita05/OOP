import java.util.Scanner;

public class Pattern8
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER NO.= ");
		int n=sc.nextInt();

		int k=1;

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}

			System.out.print("\n");
		}
	}
}