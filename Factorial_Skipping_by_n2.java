class Factorial_Skipping_by_n2
{
public static void main(int f,int n)
{int p=1;
if(f!=0)
{
for(int i=n;i>1;i=i-f)
{
p=i*p;
}
}
else
{
for(int i=1;i<n;i=i+f)
{
p=i*p;
}
}
System.out.println(p);
}
}
