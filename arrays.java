import java.io.*;
import java.util.*;
public class arrays
{
	public static void main(String args[])
	{
		int a[][]=new int[50][50];
		int b[][]=new int[50][50];
		int c[][]=new int[50][50];
		int i,j;
		int n,m;
		Scanner inp=new Scanner(System.in);
		System.out.println("Enter no rows");
		n=inp.nextInt();
		System.out.println("Enter no colums");
		m=inp.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				a[i][j]=inp.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				b[i][j]=inp.nextInt();
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			{
				System.out.print(" "+c[i][j]);
			}
			System.out.println();
		}
	}
}