/*one class have multiple main with different signatures*/
class Test3{
public static void main(String arg[]){
 System.out.println("this main will execte first");
 main(10);
} 
public static void main(int a)
{
  System.out.println(a);
}
}