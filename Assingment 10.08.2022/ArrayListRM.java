import java.util.ArrayList;
import java.util.Collections;
public class ArrayListRM 
{ 
    public static void main(String[] args) 
    {
        // Creae a list and add some colors to the list
        ArrayList<String> al = new ArrayList<String>();
        al.add("Red");
        al.add("white");
        al.add("blue");
        al.add("green");
        
        // Print the list
        System.out.println("List before shuffling:\n" + al); 
        Collections.shuffle(al);
        System.out.println("List after shuffling:\n" + al); 
       }
}
