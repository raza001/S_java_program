class astrix_diamond
{
public static void main(int n)
{
int x=0;
for(int i=1;i<=(n*2)-1;i++)
    {
if(i<=n)
        x++;
        else
        x--;
for(int j=1;j<=n-x;j++)
       {
            System.out.print(" ");  
        }
for(int k=1;k<=(x*2)-1;k++)
{
            System.out.print("*");  
        }
        System.out.println();
    }
}
}