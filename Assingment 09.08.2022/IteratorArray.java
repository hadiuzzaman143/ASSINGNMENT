import java.util.ArrayList;
import java.util.Iterator;

public class IteratorArray
{
  // main class
    public static void main(String []args)
    {  
        //Creating arraylist 
        ArrayList<String> al =new ArrayList <String>(); 
        al.add("Red");
        al.add("Green");
        al.add("Orange");
        al.add("White");
        Iterator <String> itr1 = al.iterator();  // getting the iterator

        while(itr1.hasNext())  // checking iterator has element or not
        {
          System.out.println(itr1.next());   // printing elements & move to next
        }
  }
} 

