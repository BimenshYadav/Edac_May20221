package Pattern_Star_Asmnt2;

public class Pattern13 {

	public static void main(String[] args) 
	{
		int n=6;
		int i,j,k;
		
		for(i=0;i<=n;i++)
		{
			for(k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=n-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(i=2;i<=n;i++)
		{
			for(k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
