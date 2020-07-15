class FloydTri
{
	public static void main(String args[])
	{
		int i, j = 1, k;
		for(i = 0; i<5; i++)
		{
			j = j == 1? 0: 1;
			for(k = 0; k<=i; k++)
			{
				System.out.print(j +" ");
			    j = j == 1? 0: 1;
			}

			System.out.println();
		}
	}
}	
