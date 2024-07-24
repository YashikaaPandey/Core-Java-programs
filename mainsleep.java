class mythread2 implements Runnable
{
 public void run()
{
for(int i=1;i<=10;i++)
{
try
{
Thread.sleep(5000);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("mythread2" + " " +i);
}} }
class mythread1 implements Runnable
{
 public void run()
{
for(int i=1;i<=5;i++)
{
try
{
Thread.sleep(5000);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("mythread1" + " " +i);
}} }
class mainsleep
{
public static void main(String arg[])
{
mythread2 m1=new mythread2();
mythread1 m2=new mythread1();
Thread t1=new Thread(m1);
t1.start();
Thread t2=new Thread(m2);
t2.start();
}}

