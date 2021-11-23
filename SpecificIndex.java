public class SpecificIndex {
 
    public static void main(String args[])
    {
        String str = "saniya banu";
        int index = 6;
        char ch = '_';
        System.out.println("Original String = " + str);
 
        str = str.substring(0, index) + ch
              + str.substring(index + 1);
        System.out.println("Modified String = " + str);
    }
}