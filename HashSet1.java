import java.util.*;

public class HashSet1 {
public static void main(String args[]){
	HashSet<String> hs = new HashSet<String>();
	hs.add("Saurabh");
	hs.add("Behl");
	hs.add("Saurabh");
	hs.add("Beh");
	hs.add(null);
	hs.add("Behl");
	hs.add("Fonantrix");
	hs.add("Noida");
	 Iterator itr=hs.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
}
	
	
	
}
//The hash set  removes the duplicate elements and also does not always Sorts the List. It may or may not sort the list........
//if you enter more then one null ..only one null is returned.
//
//for(String Basics : hs){
	//System.out.println(Basics);
//To create syncronized map we can use collections.syncronized map 
