/*with using lambda expression*/
interface us
{
public void show();
}
class yeslambda
{
 public static void main(String arg[])
{
int x=10;

us m=()->
{
 System.out.println("child"+x);
};
m.show();
}}