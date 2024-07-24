class anonymous
{
 int x=10,y=20;
 void cal()
{
 System.out.println(x+y);
}
public static void main(String arg[])
{
 new anonymous().cal();
 System.out.println(new anonymous());
}
}