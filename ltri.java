import java.util.Scanner;
class patz
{
public static void main(String[]args)
{
try{
int i,j,k,row;
Scanner sc=new Scanner(System.in);
System.out.println("enter row");
row=sc.nextInt();
for(i=0;i<=row;i++)
{
for(j=1;j<=row-i;j++)
{
System.out.print(" ");
}
for(k=1;k<=i;k++)
{
System.out.print("*");
}
System.out.println();
}}
catch(Exception e)
{
System.out.print("Noooooooooooooo");
}}}


