/*without using lambda expression*/
interface us
{
public void show();
}
class nolambda
{
 public static void main(String arg[])
{
int x=10;
us m=new us()
{
 public void show()
{
System.out.println("child"+ x);          /*ananonomous object*/
}
};
m.show();
}}