class newtest{
public static void main()
{
  System.out.println("it is overloaded main");
 }
 static {
   main();
}
public static void main(String args[])
{ 
System.out.println("it is invoked by JRE");
}
}