class character_fill
{
public static void main(int n,char ch,char ch1,char ch2)
{
int p=0,k=0;
for(int i=0;i<n;i++) 
{
for(int j=0;j<n;j++) 
{
if(i+j==n-1||i==j)
{
System.out.print(ch+"\t");
k++;
if(i==n/2&&j==n/2)
{
p++;
}
}
else if(k%2==0||p!=0)
{
System.out.print(ch1+"\t");
}
else
{
System.out.print(ch2+"\t");
}
}
k=0;
p=0;
System.out.println();
}
}
}