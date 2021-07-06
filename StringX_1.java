import java.util.*;
class StringX_1
{
public static void main(String args[])throws Exception
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a text containing sentences having each sentence terminating in '.','!',or'?'");
String s;
s=sc.nextLine();
int l=s.length(),l2=0,a=0;
System.out.println("Sentence"+"\t"+"No. of vowels"+"\t"+"No. of words");
System.out.println("----------------------------------------------------------");
s=s.toUpperCase();
for(int i=0;i<l;i++)
{int w=0,c=0;
char ch=s.charAt(i);
if(ch=='.'||ch=='!'||ch=='?')
{
a++;int k=i,l1=i+1;
for(int j=l2;j<k;j++)
{
char ch2=s.charAt(j);
if(ch2=='A'||ch2=='E'||ch2=='O'||ch2=='I'||ch2=='U')
{
c++;
}
}
for(int g=l2;g<k;g++)
{
char ch3=s.charAt(g);
if(ch3==' ')
{
w++;
}
}
w=w+1;
l2=l1;
System.out.print(a+"       \t      "+c+"      \t      "+w);
System.out.println();
}
}
System.out.println("----------------------------------------------------------");
}
}