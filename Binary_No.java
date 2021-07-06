class Binary_No
{
public static void main(int n)
{int dup=n;
int s=0;String s1="";
while(n!=0)
{
int j=n%2;
s1=j+s1;
n=n/2;
}
System.out.println("Binary of "+dup+" = "+s1);
}
}
