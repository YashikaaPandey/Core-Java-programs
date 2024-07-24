class array_rev
{
 public static void main(String arg[])
 {
   int x[]={10,20,30,40,50};
    System.out.println("original array");
   for(int i=0;i<x.length;i++)
    {
      System.out.println(x[i]+ " ");
    }
    System.out.println();
    System.out.println("array in inverse");
    for(int i=x.length-1;i>=0;i--)
      {
        System.out.println(x[i]+ " ");
      }
 }
}
   
 