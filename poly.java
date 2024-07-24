class poly
{
 void sum(int x,float y)
{
 System.out.println(x+y);
}
void sum(int x,float y,double z)
{
 System.out.println(x+y+z);
}
public static void main(String arg[])
{
 poly p=new poly();
  p.sum(10,20.5f);
  p.sum(10,20.5f,3000.5);
}
}