class Inserting_A_Value_In_An_Array
{
    public static void main(int a[],int x,int pos)
    {
        int n=a.length;
        int b[]=new int [n+1];
        for(int i=0;i<n;i++)
        {
            if(i<pos-1)
                b[i]=a[i];
            else
                b[i+1]=a[i];
        }
        b[pos-1]=x;
        n++;
        for(int i=0;i<n;i++)
        {
            System.out.println(b[i]);
        }
    }
}