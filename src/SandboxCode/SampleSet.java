
package SandboxCode;

import java.util.*;

public class SampleSet {

  public static void main(String args[]) { 
     
      // an array of names that holds race contestant names in no particular order
      String contestants[] = {"Brad", "Zach", "Homer", "Cynthia", "Jimmy", "Billie"};
     
      // initialize a set collection and fill it using a loop with the array of names
      // this is a hash set so it will not assign any ordering
      Set<String> contSet = new HashSet<>();
        for(int i = 0; i<6; i++){
           contSet.add(contestants[i]);
        }
        
        // show the set contents
        System.out.println(contSet);
  
        // initialize a treeset, which will put the names in order
        // the elements of the hashset are put into the treeset
        TreeSet sortedContSet = new TreeSet<>(contSet);
        
        // show the treeset and how it orders the names alphabetically
        System.out.println("The sorted list is:");
        System.out.println(sortedContSet);

        // a few other things you can do with sorted sets
        System.out.println("The First element of the set is: "+
                          (String)sortedContSet.first());
        System.out.println("The last element of the set is: "+
                        (String)sortedContSet.last());
  }
}
