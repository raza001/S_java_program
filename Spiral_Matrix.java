class Spiral_Matrix
{
    public static void main(int n)
    {
        int a[][]=new int[n][n],r=0,c=0,x=1;
        for(int i=n-1;i>=1;i-=2)
        {
            for(int j=0;j<i;j++)
            {a[r][c++]=x++;}
            for(int k=0;k<i;k++)
            {a[r++][c]=x++;}
            for(int l=0;l<i;l++)
            {a[r][c--]=x++;}
            for(int m=0;m<i;m++)
            {a[r--][c]=x++;}
             r++;c++;
        }
        System.out.println("Here's your matrix");
        if(n%2==1)
       { a[n/2][n/2]=n*n;}
       for(int n3=0;n3<n;n3++)
       {     
             for(int n4=0;n4<n;n4++)
            {
            System.out.print(a[n3][n4]+"\t");
            }
            System.out.println();
           }
        }        
    }