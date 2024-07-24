interface my
{
void show();
}
class child2 implements my
{
public void show()
{
 System.out.println("child show call");
}
public static void main(String arg[])
{
child2 c=new child2();
c.show();
}}
