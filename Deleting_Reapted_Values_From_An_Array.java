class Deleting_Reapted_Values_From_An_Array
{
    public static void main(int a[],int n)
    {
     int k=0;
    for(int i=0;i<a.length-1;i++)
     {
         if(a[i]!=a[i+1])
         a[k++]=a[i];
        }
        a[k++]=a[a.length-1];
    for(int l=0;l<k;l++)
    {System.out.print(a[l]+"\t");}
}
}               