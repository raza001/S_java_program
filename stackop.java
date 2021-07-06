class stackop
{
int sp,n;
int s[]=new int[5];
stackop(int nn)
{
n=nn;
for(int i=0;i<5;i++)
s[i]=0;
sp=-1;
}
void pushdata(int item)
{
if(sp==(n-1))
System.out.println("Stack Overflows");
else
{
sp++;
s[sp]=item;
}
}
void popdata()
{
int v;
if(sp==-1)
System.out.println("Stack Underflows");
else
{
v=s[sp];
System.out.println("Popped out element i="+v);
sp--;
}
}
void display()
{
if(sp==-1)
System.out.println("Stack empty");
else
{
System.out.println("Sp---->|"+s[sp]+"|");
System.out.println("  __");
for(int i=sp-1;i>=0;i--)
{
System.out.println("   |"+s[i]+"|");
System.out.println("   __");
}
}
}
}