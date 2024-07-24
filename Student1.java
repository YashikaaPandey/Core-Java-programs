class Student1 implements java.io.Serializable
{
private String name,course;
int fee;
public Student1(String n,String c,int f)
{
name=n;
course=c;
fee=f;
}
public void show()
{
System.out.println(name+"\t"+course+"\t"+fee);
}
}