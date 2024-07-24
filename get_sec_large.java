static int get_sec_large(int[] a,int total)
{ int temp;
  for(i=0;i<total;i++)
   {
     for(int j=i+1;j<total;j++)
      {
        if(a[i]>a[j])
        {
         temp=a[i];
          a[i]=a[j];
         a[j]=temp;
}}}}

}
int a[]={1,2,5,6,3,2};
System.out.println(get_sec_large(a,6));
