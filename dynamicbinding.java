class base
{
 void show()
{
 System.out.println("base show call");
}
}
class child extends base
{
 void show()
{
System.out.println("child show call");
super.show();
}
void disp()
{
System.out.println("disp in child");
}
public static void main(String arg[])
{
base b=new child();
 b .show();
child c=(child)b;
c.disp();

}}