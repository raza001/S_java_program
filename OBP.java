class OBP
{
int x,y;
OBP()
{
x=0;y=0;
}
OBP(int x1,int y1)
{
x=x1;
y=y1;
}
OBP add(OBP A,OBP B)
{
OBP C = new OBP();
C.x=A.x+B.x;
C.y=A.y+B.y;
return C;
}
void display()
{
System.out.println("x="+x);
System.out.println("y="+y);
System.out.println();
}
public static void main()
{
OBP A=new OBP(10,20);
OBP B=new OBP(5,10);
OBP C=new OBP();
C=C.add(A,B);
A.display();
B.display();
C.display();
}
}