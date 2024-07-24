interface my
{
 public void show();
}
interface my1 extends my
{
 public void disp();
}
class child implements my1
{
public void show()
{ 
System.out.println("child show call");
}
public void disp()
{
System.out.println("child disp call");
}
public static void main(String arg[])
{
 child c=new child();
 c.show();
 c.disp();
}}