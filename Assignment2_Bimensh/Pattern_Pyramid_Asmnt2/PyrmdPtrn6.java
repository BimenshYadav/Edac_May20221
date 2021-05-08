package Pattern_Pyramid_Asmnt2;

public class PyrmdPtrn6 {

	public static void main(String[] args)
	{
		int i,j,k,n=9;
		for(i=0;i<=n;i++)
		{
			for(k=0;k<=i;k++) 
			{
				System.out.print(" ");
			}
			for(j=1;j<=n-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
