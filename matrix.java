import java.util.Scanner;
class matrix
{

public static void main(String args[])
{
	int row,cols,i,j,k;
	Scanner na=new Scanner(System.in);
	System.out.print("Enter number of row :");
	row=na.nextInt();
	System.out.print("Enter number of cols :");
	cols=na.nextInt();
	int ar[][]=new int[row][cols];
	for(i=0;i<row;i++)
	{
		for(j=0;j<cols;j++)
		{
			ar[i][j]=na.nextInt();
		}
	}
	for(i=0;i<row;i++)
	{
		for(j=0;j<cols;j++)
		{
			System.out.print(ar[i][j]);
		}
		System.out.println("  ");
	}
	na.close();
}
}