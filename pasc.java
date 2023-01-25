import java.io.*;
import java.util.Scanner;
class pascal
{
public static void main(String[]args)
{
int i,j,k,row;
Scanner sc=new Scanner(System.in);
System.out.println("enter row:");
row=sc.nextInt();
for(i=0;i<=row;i++)
{
	for(j=row;j>i;j--)
	{
		System.out.print(" ");
	}
	int c=1;
	for(k=0;k<=i;k++)
	{
		System.out.print(c + " ");
		c=c*(i-k)/(k+1);
	}
	System.out.println("\n");
}
}}