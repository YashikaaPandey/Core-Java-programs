import java.io.*;
class emp
{
String name;
int id,age;
emp(String name,int age,int id)
{
this.name=name;
this.age=age;
this.id=id;
}
void disp()
{
System.out.println("name:"+name);
System.out.println("age:"+age);
System.out.println("id:"+id);
}
}
class bufferreader
{
public static void main(String arg[])throws Exception
{
BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter your name");
String name=reader.readLine();
System.out.println("enter your age");
int age=Integer.parseInt(reader.readLine());
System.out.println("enter your id");
int id=Integer.parseInt(reader.readLine());
emp e1=new emp(name,age,id);
e1.disp();
}}
