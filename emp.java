//program for object class difference
class emp 
{
  int eid;
  String ename,cname;
  void input(int ei,String en,String cn)
{
  eid=ei;
  ename=en;
  cname=cn;
}
  void show()
{
  System.out.println(eid);
  System.out.println(ename);
  System.out.println(cname);
} 
public static void main(String arg[])
{
  emp e1=new emp();
  e1.input(2,"ram","it");
  e1.show();
  System.out.println(e1);
  emp e2=new emp();
  e2.input(3,"seeta","it");
  e2.show();
  System.out.println(e2);
}}