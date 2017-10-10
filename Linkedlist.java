
/* Name: Peter Tran
 * class: Cs2003
 * date: 10/10/2017
 * 
 */
package lab7;
import java.util.LinkedList;
import java.util.ListIterator;
public class Linkedlist 
{ 
	
public static void main(String[] args)
{  // add each element into firt list

	LinkedList<String>  first = new LinkedList<String>();
	first.add("Tulsa");
	first.add("Ada");
	first.add("Broken Arrow");
	first.add("Owasso");
	
	// add each element into second list
	LinkedList<String> second = new LinkedList<String>();
	second.add("74014");
	second.add("74135");
	second.add("foo");
	second.add("hello world");
	second.add("777");
	
	System.out.println(first);
	System.out.println(second);
	
	// merge the second list into firstlist
	first.addAll(second);
	System.out.println(first);
	
	// remove any second word from the merge list 
	first.remove(2);
	first.remove(6);
	System.out.println(first);
	
	// deep copy the second list
    LinkedList<String> secondCopy = new LinkedList<String>(second);
    System.out.println(secondCopy);
}
}

