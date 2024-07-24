class throw2
{
 static void show() throws ArrayIndexOutOfBoundsException
{
int x[]=new int[5];
x[10]=100;
throw new ArrayIndexOutOfBoundsException();
}
public static void main(String args[]) throws Exception
{
show();
}
}