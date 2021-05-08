package Pattern_Star_Asmnt2;

public class Pattern8 {

	public static void main(String[] args)
	{
		int n=5;
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
