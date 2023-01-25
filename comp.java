import java.io.*;
import java.util.Scanner;
class composite
{
public static void main(String[] args)
{

Scanner sc=new Scanner(System.in);
System.out.println("enter start number");
int a=sc.nextInt();
System.out.println("enter end number");
int b=sc.nextInt();
for(int i=a;i<b;i++)
{
	int n=0;
	for(int j=2;j<i;j++)
	{
		if(i%j==0)
		{
			n++;
			
		}
		if(n!=0)
		{
			System.out.println(i);
			break;
		}

	}
}
}
}

