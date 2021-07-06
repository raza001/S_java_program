import java.io.*;
class Neon
{
public static void main(String args[])throws Exception
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int n,sq,sum=0;
System.out.println("Enter the number:");
n=Integer.parseInt(br.readLine());
sq=n*n;
 while(sq>0)
{
 sum=sum+sq%10;
 sq=sq/10;
}
if(n==sum)
 System.out.println(n+ " is a neon number");
else
 System.out.println(n+ " is not a neon number");
}
}