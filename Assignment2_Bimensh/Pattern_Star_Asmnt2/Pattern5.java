package Pattern_Star_Asmnt2;

public class Pattern5 {

	public static void main(String[] args) 
	{
		int n=5;
		int i,j,k;
		
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

}
