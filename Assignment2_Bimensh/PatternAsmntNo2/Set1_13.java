package PatternAsmntNo2;

public class Set1_13 {

	public static void main(String[] args) 
	{
		int i,j,k,alpha=64;
		for(i=1;i<=5;i++)
		{
			for(j=1;j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print((char)(alpha+i)+" ");
			}
			System.out.println("");
		
		}
	}

}
