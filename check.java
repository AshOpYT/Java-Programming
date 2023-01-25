import java.io.*;
import java.util.*;
class check
{
public static void main(String[] args)
{


System.out.println("enter username");
Scanner sc=new Scanner(System.in);
String ch=sc.nextLine();
System.out.print("enter username");
Scanner mc=new Scanner(System.in);
String m=mc.nextLine();
//System.out.println(ch);
//System.out.println(m);
if(ch.compareTo(m)==0)
{
System.out.println("equal");
}
else
{
System.out.println("invalid");
}
}
}

