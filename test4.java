//static block will execute before the main method
class test4
{ 
static int x=10;
 static
{
System.out.println("static block call"+10);
}
void show()
{
System.out.println("normal show call");
}
public static void main(String arg[])
{
System.out.println("main method call");
test4 t=new test4();
t.show();
}}
