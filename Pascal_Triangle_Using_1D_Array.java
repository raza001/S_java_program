class Pascal_Triangle_Using_1D_Array
{
    public static void main(int n)
    {
        int a[]=new int[n+1];
        a[0]=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {System.out.print(a[j]);}
            for(int k=i+1;k>0;k--)
            {a[k]=a[k]+a[k-1];
            }System.out.println();
        }
    }
}