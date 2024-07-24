class one
{
public one()
{
System.out.println("one");
}}
class Two extends one
{
public Two()
{
System.out.println("two");

}}
class Three extends Two
{
public Three()
{
System.out.println("three");
}}
class Test_string
{
public static void main(String arg[])
{
Three three=new Three();
}}