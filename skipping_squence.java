import java.util.*;
class skipping_squence
{
public static void main(String args[])throws Exception
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a natural no. less than 50");
int n=sc.nextInt();int b[]=new int[n],a=2,s=1,temp,g=0;
if(n<=50&&n>0)
{
for(int i=0;i<n;i++)
{
b[i]=i+1;System.out.print(b[i]);
}
System.out.println();
while(n/a+2>=a)
{
for(int i=s;i<n;i=i+a)
{
b[i]=0;
}
for(int j=0;j<n;j++)
{
if(b[j]!=0)
{
temp=b[j];
b[j]=0;
b[g]=temp;
g++;
}
}
for(int k=0;k<n;k++)
{
if(b[k]!=0)
{System.out.print(b[k]+" ");}}
System.out.println();
s++;a++;g=0;
}
}
}
}