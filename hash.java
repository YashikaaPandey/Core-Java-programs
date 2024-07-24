class hash
{
 int x,y;
 void input(int x1,int y1)
{
  this.x=x1;
  this.y=y1;
}
void show()
{
 System.out.println(x);
 System.out.println(y);
}
public static void main(String agr[])
{
 hash t1=new hash();

 t1.input(10,20);
 t1.show();
System.out.println(t1.hashCode());

hash t2=new hash();

t2.input(30,40);
 t2.show();
System.out.println(t2.hashCode());
}}


