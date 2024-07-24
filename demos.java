/*abstraction explanation*/


abstract class plan
{
 abstract void rate();
}
class demos extends plan
{
  int unit, rate;
  void rate()
{
 unit=50;
 rate=5;
 System.out.println("demos plan" + (unit*rate));
}}
class comer extends plan
{
int unit,rate;
void rate()
{
unit=100;
 rate=10;
System.out.println("comer plan" + (unit*rate));
}
public static void main(String[] args)
{
 plan p1=new demos();
 p1.rate();
 plan p2=new comer();
 p2.rate();
}}