//sorting
class new
{
int arr[]=new int {78,34,1,3,-1,-4,6,55,20,65};
for(int i=0;i<arr.length;i++)
{
 for(int j=i+1;j<arr.length;j++)
 {
  int temp=0;
  if(arr[i]>arr[j])
  {
    temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
}
}
System.out.println(arr[i]);
}
}