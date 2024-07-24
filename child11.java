@FunctionalInterface
interface my
{
 void say(String msg);
}
class child11 implements  my
{
 public void say(String msg)
{
 System.out.println("child show ");
}
public static void main(String arg[])
{
 child11 c=new child11();
 c.say("yashika");
}
}
