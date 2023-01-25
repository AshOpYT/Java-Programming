import java.io.*;
import java.util.Scanner;
class skip
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter start number");
int m=sc.nextInt();
System.out.println("enter end number");
int n=sc.nextInt();
System.out.println("enter skip number");
int k=sc.nextInt();
if(m>n||m==n)
{
System.out.println("invalid");
}
else if (k<0)
{
System.out.println("invalid");
}
else
{ 
for(int i=m;i<n;i++)
{
System.out.println(i);
i=i+k;
}
}
}}