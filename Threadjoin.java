class MyRunnable implements Runnable
{
public void run()
{
System.out.println("Thread started" + Thread.currentThread().getName());
try
{
Thread.sleep(4000);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Thread ended" + Thread.currentThread().getName());
}
}
class Threadjoin
{
public static void main(String args[])
{
Thread t1=new Thread(new MyRunnable(),"t1");
Thread t2=new Thread(new MyRunnable(),"t2");
Thread t3=new Thread(new MyRunnable(),"t3");
t1.start();
//start second thread after waiting for 2 seconds or its dead
try
{
t1.join(2000);
}
catch(Exception e)
{
System.out.println(e);
}
t2.start();
//start third thread after waiting for 2 seconds or its dead
try
{
t1.join();
}
catch(Exception e)
{
System.out.println(e);
}
t3.start();
//let all thread finish execution before finishing main thread 
try
{
t1.join();
t2.join();
t3.join();
}
catch(Exception e)
{

System.out.println(e);
}
System.out.println("all thread are dead,existing main Thread");
}
}