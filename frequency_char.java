class frequency_char
{
public static void main(String arg[])
{
String str="this is good";
int freq[]=new int[str.length()];
   int i,j;
    char string[]=str.toCharArray();
   for(i=0;i<str.length();i++){ 
        freq[i]=1;

     for(j=0;i<str.length();j++){
        if (string[i]==string[j]){
          freq[i]++;
       string [j]=0;
  }
 }
}
  
  for(i=0;i<freq.length;i++){
     if(string[i]!=' '&&string[i]!='0'){
     System.out.println(string [i]+"-"+freq[i]);
 }
}
}
}