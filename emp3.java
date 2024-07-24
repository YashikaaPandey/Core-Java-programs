class emp3
{
 int eid;
 String ename;
 void accept(int eid, String ename)
{
 this.eid=eid;  //if we replace this from here then eid will become the local variable will print the default values
 this.ename=ename;
}
void disp()
{
 System.out.println(eid);
 System.out.println(ename);
}
public static void main(String arg[])
{
 emp3 e1= new emp3();
 e1.accept(1,"ram");
 e1.disp();
 emp3 e2= new emp3();
 e2.accept(1,"sita");
 e2.disp();
}}