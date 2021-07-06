class Magical_Number
{
public static void main(int n)
{
int num=n,sum=0,f=n;int d=0;
while(num>9)
{
 sum=num;int s=0;
     while(sum!=0)
    {
     s=s+(sum%10);
     sum=sum/10;
    }
    num=s;
 }
if(num==1)
{
  System.out.println(f+" is a magical number");
}
 else
 {
 System.out.println(f+" is not a magical number");
}
}
}