class Reserve implements Runnable
{
int available=1;
int wanted;
Reserve(int i)
{
wanted=i;
}
public void run()
{
synchronized(this)
{
System.out.println("Available birth="+available);
if(available>=wanted)
{
String name=Thread.currentThread().getName();
System.out.println(wanted + "birth reserved for" + name);
try
{
Thread.sleep(1000); //wait for print the ticket
available=available-wanted;
}
catch(InterruptedException e)
{
System.out.println(e);
}
}
else
System.out.println("sorry,No birth available");
}}}

class unsafe
{
public static void main(String arg[])
{
Reserve obj=new Reserve(1);
//attach first thread to object;
Thread t1=new Thread(obj);
//attach second thread to object;
Thread t2=new Thread(obj);
//take the thread name as person
t1.setName("yasika");
t2.setName("vanshika");
//send request for birth
t1.start();
t2.start();
}}
