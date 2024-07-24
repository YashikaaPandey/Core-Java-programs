//parameterized constructor
class company
{
 int eid;
 String ename,post;
 company(int eid, String ename, String post)
{ 
 this.eid=eid;
 this.ename=ename;
 this.post=post;
}
void disp()
{
 System.out.println(eid);
 System.out.println(ename);
 System.out.println(post);
} 
public static void main(String arg[])
{
 company c1=new company(1,"yashika","btech");
 c1.disp();
 company c2=new company(2,"yash","btech");
 c2.disp();
}}