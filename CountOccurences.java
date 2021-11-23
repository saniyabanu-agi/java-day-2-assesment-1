public class CountOccurences
{
 
  static int findOccurrences(String str, char search, int index)
  {
      if(index >= str.length())
      return 0;
      
      int count=0;
      
      if(str.charAt(index) == search)
      count++;
      
      return count + findOccurrences(str,search,index+1);
  }
   
  public static void main(String args[]) 
  {
      
  String input = "aaaabbccAAdd";
  char search = 'b';          
  
  int result = findOccurrences(input,search,0);
  System.out.println("The Character '"+search+"' appears "+result+" times.");
  }
}
 