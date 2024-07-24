class InvalidAge extends Exception
{
String message;
InvalidAge()
{
 message="Age range is 18 to 60";
}
InvalidAge(String age)
{
message=age;
}
public String toString()
{
return message;
}
class Custom_Exception
{
public static void main(String arg[])
{
 if(arg.length==0)
 System.out.println("enter your age as command line argument");
else
{
try
{
int a=Integer.parseInt(arg[0]);
if(a<18||a>60)
throw(new InvalidAge());
System.out.println("welcome to the portfolio..");
}
catch(Exception e)
{
System.out.println(e);
}
}
}
}
}