import java.util.*;
 
public class Insert {
    public static void main(String args[]) throws Exception
    {
        int given_number = 1;
        int array[] = { 6, 7, 8, 2, 3, 4, 5, 9, 10 };
        int new_array[] = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            new_array[i] = array[i];
        }
        new_array[new_array.length - 1] = given_number;
        Arrays.sort(new_array);
        for (int i = 0; i < new_array.length; i++)
            System.out.print(new_array[i] + " ");
    }
}