class Armstrong_Number
{
public static void main(int n)
{
int num=n,f=n,s=0;
while(num!=0)
    {
        int d=num%10;
        s=s+(d*d*d);
        num=num/10;
    }
if(s==f)
{
  System.out.println(f+" is a armstrong number");
}
 else
 {
 System.out.println(f+" is not a armstrong number");
}
}
}