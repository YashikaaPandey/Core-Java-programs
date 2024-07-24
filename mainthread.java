class mythread1 implements Runnable
{
public void run()
{
int i=1;
while(i<=10)
{
System.out.println("Mythread1"+i);
i++;
}
}
}
class mythread2 implements Runnable
{
public void run()
{
int i=1;
while(i<=15)
{
System.out.println("Mythread2"+i);
i++;
}
}
}
class mainthread
{
public static void main(String arg[])
{
mythread1 t1=new mythread1();
Thread tt=new Thread(t1);
tt.start();
mythread2 t2=new mythread2();
Thread ttt=new Thread(t2);
ttt.start();
}}

