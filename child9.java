interface my
{
 default void show()
{
 System.out.println("my show call");
}}
class child9 implements my
{
 void disp()
{
 System.out.println("child disp call");
}
public static void main(String arg[])
{
 child9 c=new child9();
 c.disp();
 c.show();
}}