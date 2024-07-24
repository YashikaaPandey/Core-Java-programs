interface my
{
 void show();
 void disp();
}
abstract class child5 implements my
{
 public void show()
{
 System.out.println("child show call");
}
abstract void print();
}
class child4 extends child5

{
void print()
{
 System.out.println("child print call");
}
public void disp()
{
System.out.println("disp print call");
}
public static void main(String arg[])
{
child4 c=new child4();
c.show();
c.print();
c.disp();
}}
