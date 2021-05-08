package PatternAsmntNo2;

public class Set1_8 {

	public static void main(String[] args) 
	{
		for(int i=5;i>=1;i--)
        {
            for(int j=2;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<=5;k++)
            {
                System.out.print(" "+k);
            }
            
            System.out.println();
        }

	}
}
/* 
 int i,j;
		for(i=5;i>=1;i--)
		{
			for(j=5;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}*/
