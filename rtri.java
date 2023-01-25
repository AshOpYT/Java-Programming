import java.io.*;
import java.util.Scanner;
class pat
{
public static void main(String[] args)
{
try{
int i,j,row;
Scanner sc=new Scanner(System.in);
System.out.println("enter row");
row=sc.nextInt();
for(i=0;i<row;i++)
{
for(j=0;j<=i;j++)
{
System.out.print("* ");
}
System.out.println();
}}
catch(Exception e)
{
System.out.println("nooo");
}}
}