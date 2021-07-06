import java.util.*;
class Multiplication_of_matrix
{
    public static void main(String args[])throws Exception
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter m and n as column and row for 'a' matrix");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        System.out.println("Enter "+m*n+" values");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter n1 and m1 as column and row for 'b' matrix");
        int n1=sc.nextInt();
        int m1=sc.nextInt();
        int b[][]=new int[n1][m1];
        System.out.println("Enter "+m1*n1+" values");
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<m1;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        if(n==n1)
        {int c[][]=new int[m][m1];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m1;j++)
            {
                for(int k=0;k<n;k++)
                {
                    c[i][j]=(a[i][k]*b[k][j])+c[i][j];
                }
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m1;j++)
            {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
}