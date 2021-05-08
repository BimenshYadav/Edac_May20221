

package Pattern_Star_Asmnt2;

public class Pattern16 {

	public static void main(String[] args) 
	{
		/*for(int row=1;row<=5;row++)
		{
		
		for(int col=1; col<=row; col++)
		{
			if(row==col||col==1||row==5)
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print("*");
			}
		}
		System.out.println();
	}*/
		
		int n=6;
		int i,j,k;
		for(i=1;i<=n;i++)
		{
			for(k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{
				if(i==j||j==5||i==4)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
				
			}
			System.out.println();
		}
	}

}
