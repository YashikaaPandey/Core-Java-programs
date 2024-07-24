class excep_trick
{
public static void main(String arg[])
{
try
{
int x=10/2;
int y[]=new int[5];
y[100]=50;
}
catch(Exception e)
{
System.out.println(e);
} 
}
}