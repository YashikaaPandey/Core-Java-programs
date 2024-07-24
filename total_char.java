class total_char{
  public static void main(String arg[]){
     String str="parth saini  ";
      int count=0;
   for (int i=0;i<str.length();i++){
     if(str.charAt(i)!=' '){
     count++;
  }
 }
 System.out.println("totol no of char in aString " +count);
 } 
}