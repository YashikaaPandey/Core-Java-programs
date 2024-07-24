class mythread1 extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("mythread1"+i);
}}}
class mythread2 extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println("mythread2"+i);
}}}
class mainthread2
{
public static void main(String arg[])
{
mythread1 t1=new mythread1();
t1.setPriority(10);
t1.start();
System.out.println(t1.getPriority());
mythread2 t2=new mythread2();
t2.setPriority(2);
t2.start();
System.out.println(t2.getPriority());
}}