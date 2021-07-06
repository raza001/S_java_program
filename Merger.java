import java.util.*;
class Merger
{
long n1,n2,mergeNum;
Merger()
{
n1=0;n2=0;mergeNum=0;
}
void readNum()
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter two number.");
n1=sc.nextLong();
n2=sc.nextLong();
}
void JoinNum()
{long dup=n2,dup1=n1;int c=0;
while(dup!=0)
{
dup=dup/10;
c++;
}
for(int i=0;i<c;i++)
dup1=dup1*10;
mergeNum=dup1+n2;
}
void show()
{
System.out.println("Original numbers="+n1+" "+n2);
System.out.println("Merged number="+mergeNum);
}
public static void main(String args[])
{
Merger me = new Merger();
me.readNum();
me.JoinNum();
me.show();
}
}