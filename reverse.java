import java.io.*;
import java.util.Scanner;
public class reverse
{
public static void main(String[] args)
{
String s="!@#$%",str="";
char ch;
for(int i=0;i<s.length();i++)
{
ch=s.charAt(i);
str=ch+str;
}
System.out.print(str);
}
}