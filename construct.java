//understanding constructor
class construct
{
 int x,y;
//constructor can be private
 private construct()
 { 
 x=y=10;
 }
 void show()
{ 
 System.out.println(x);
 System.out.println(y);
}
public static void main(String arg[])
{
 construct t1=new construct();
  t1.show();
}}