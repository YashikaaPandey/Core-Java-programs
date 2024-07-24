//THIS KEYWORD
class test6
{
int x=10;
void show(int x, test6 z)
{
System.out.println(z.x);
System.out.println(x);
System.out.println(z);

}
public static void main(String arg[])
{
test6 t1=new test6();
t1.show(20,t1);
System.out.println(t1);
test6 t2=new test6();
t2.show(20,t2);
System.out.println(t2);

}}