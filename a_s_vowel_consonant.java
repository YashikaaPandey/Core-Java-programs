class a_s_vowel_consonant
{

 public static void main(String arg[]){
   int vcount=0,ccount=0;
   String str="THIS IS Yashika";
     
   str=str.toLowerCase();
 for(int i=0;i<str.length();i++){  
      if(str.charAt(i)=='a'|| str.charAt(i)=='e'||str.charAt(i)=='i' ||str.charAt(i)=='o'||str.charAt(i)=='u'){
       vcount++;
}
   else if(str.charAt(i)>='a' ||str.charAt(i)<='z'){
          ccount++;
   }
}
  System.out.println(vcount);
 System.out.println(ccount);
}
}