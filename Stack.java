class Stack extends Stack1
{
int s[]=new int[20];
int sp,n;
Stack(int nn)
{
n=nn;
for(int i=0;i<n;i++)
s[i]=0;
sp=-1;
}
void insert(int item)
{
if(sp==n-1)
{
System.out.println("Stack is overflowing.");
}
else
{
s[sp]=item;
sp++;
}
}
void delete()
{
if(sp==-1)
System.out.println("Stack is underflowing.");
else
{
s[sp]=0;
sp--;
System.out.println("Element has been deleted.");
}
}
void display()
{
if(sp==-1)
System.out.println("Stack is empty");
else
{
for(int i=sp-1;i>=0;i--)
System.out.println(s[i]);
}
}
}
class Stack1
{
public static void main(String[] args)
{
Stack ob = new Stack();
ob.insert();
ob.delete();
ob.display();
}
}