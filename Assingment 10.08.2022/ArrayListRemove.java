import java.util.ArrayList;;
public class ArrayListRemove 
{
    
    public static void main(String[] args) 
    {
        // Creae a list and add some colors to the list
        ArrayList<String> al = new ArrayList<String>();
        al.add("Red");
        al.add("Green");
        al.add("Orange");
        al.add("White");
        al.add("Black");
        // Print the list
        System.out.println(al);
        // Remove the third element from the list.
        al.remove(2);
        // Print the list again
        System.out.println("After remove third element from the list:\n" + al);
       } 
}