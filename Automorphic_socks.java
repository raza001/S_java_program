class Automorphic_socks
{
public static void main(int n)
{
int dup=n,c=0,s=n*n;
while (n!=0)
{
n=n/10;
c++;
}
int d=(s)%((int)Math.pow(10,c));
if(dup==d)
{
System.out.println("Automorphic");
}
else
{
System.out.println("Not Automorphic");
}
}
}