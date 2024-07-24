class mythread1 extends Thread
{
public void run()
{
for (int i=0;i<=5;i++)
{
System.out.println("mythread1:" +i);
}}}
class mythread2 extends Thread
{
public void run()
{
for(int i=0;i<10;i++)
{
System.out.println("mythread2:" +i);
}}}
class main
{
public static void main(String arg[])
{
mythread1 t1=new mythread1();
t1.start();
mythread2 t2=new mythread2();
t2.start();
}} 


