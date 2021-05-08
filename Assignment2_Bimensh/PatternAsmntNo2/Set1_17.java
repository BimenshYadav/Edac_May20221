package PatternAsmntNo2;

public class Set1_17 {

	public static void main(String[] args) 
	{
		int i,j;
		int count=0;
		for(i=1;i<=5;i++)
		{
			
			for(j=1;j<=i;j++)
			{
				count=count+1;
			
				System.out.print(" "+count);
			}
			System.out.println();
		}

	}

}
