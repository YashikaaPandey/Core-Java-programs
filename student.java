class student
{
  int sid;
  String sname,city;
  void accept(int si, String sn, String ci)
{
  sid=si;
  sname=sn;
  city=ci;
}
void show()
{
 System.out.println(sid);
 System.out.println(sname);
 System.out.println(city);
}
public static void main(String arg[])
{
 student s1=new student();
 s1.accept(1,"anit","delhi");
 s1.show();
 student s2=new student();
 s2.accept(1,"amit","delhi");
 s2.show();
}
}