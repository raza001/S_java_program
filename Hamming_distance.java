class Hamming_distance
{
public static void main(int n,int m)
{
int c=0;
while(n!=0&&m!=0)
{
int x=n%2;
n=n/2;
int y=m%2;
m=m/2;
if(x==y)
{
  c=c+1;
}
}
System.out.println("Hamming Distance="+c);
}
}
