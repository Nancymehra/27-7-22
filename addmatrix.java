import java.util.Scanner;
class addmatrix
{

public static void main(String args[])
{
	int row,cols,i,j;
	Scanner na=new Scanner(System.in);
	System.out.print("Enter number of row :");
	row=na.nextInt();
	System.out.print("Enter number of cols :");
	cols=na.nextInt();
		 int ar[][]=new int[row][cols];
        	 int ar[][]=new int[row][cols];
        	 int ar[][]=new int[row][cols];
	System.out.println("Enter value of first array: ");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<cols;j++)					//
		{
			arr[i][j]=na.nextInt();
		}
	}
	System.out.println("Enter the value of second array: ");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<cols;j++)
		{
			brr[i][j]=na.nextInt();
		}
	}
	display(row,cols,arr,brr,crr);
	na.close();
}

public static void display(int row,int cols,int arr[][],int brr[][],int crr[][]);
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<cols; j++)
		{
			crr[i][j]= arr[i][j]+brr[i][j];
			System.out.print(crr[i][j]+" ");
		}
		System.out.println(" ");
	}
}
