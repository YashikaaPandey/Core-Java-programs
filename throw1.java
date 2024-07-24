class throw1
{
 static void show()
{
 try
{
int x[]=new int[5];
x[10]=100;
throw new ArrayIndexOutOfBoundsException();
}
catch(Exception e)
{
System.out.println(e);
}
}
public static void main(String args[])
{
show();
}
}