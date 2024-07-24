class chain
{
 chain()
{
  this(10);
  System.out.println("default constructor call");
 }
chain(int x)
{
this(10,20);
System.out.println(x);
}
chain(int x,int y)
{
 System.out.println(x+y);
 }
public static void main(String arg[])
{
new chain();
}
}