package SandboxCode;
import java.util.HashMap; //Must be included to use the HashMap
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

// This is an example of HashMap use

class SampleMap {
    public static void main(String args[]){
        //Create Hashmap and FIll
        HashMap<String, Integer> hashRaceResults = new HashMap<>();
        hashRaceResults.put("Jim", 1);
        hashRaceResults.put("Alex", 2);
        hashRaceResults.put("Rick", 3);
        hashRaceResults.put("Carl", 4);
        hashRaceResults.put("Ashley", 5);
        hashRaceResults.put("Sally", 6);
        hashRaceResults.put("Brad", 7);
        hashRaceResults.put("Cindy", 8);
        hashRaceResults.put("Shawn", 9);
        hashRaceResults.put("Ted", 10);
        
        //create TreeMap and Fill
        TreeMap<Integer, String> treeRaceResults = new TreeMap<>();
        treeRaceResults.put(1, "Jim");
        treeRaceResults.put(2, "Alex");
        treeRaceResults.put(3, "Rick");
        treeRaceResults.put(4, "Carl");
        treeRaceResults.put(5, "Ashley");
        treeRaceResults.put(6, "Sally");
        treeRaceResults.put(7, "Brad");
        treeRaceResults.put(8, "Cindy");
        treeRaceResults.put(9, "Shawn");
        treeRaceResults.put(10, "Ted");
        
        //how to iterate through HashMap and Display the key and mapped values
        
        //Method #1: Using EntrySet and advanced for loop
        System.out.println("Using EntrySet");
        for(Map.Entry<String, Integer> raceEntry : hashRaceResults.entrySet()){
            System.out.println(raceEntry.getKey() +" :: "+ raceEntry.getValue());
        }
 
        //Method #2: Using KeySet and advanced for loop.

        System.out.println("Using KeySet");
        for(String key: hashRaceResults.keySet()){
            System.out.println(key  +" :: "+hashRaceResults.get(key));
        }
 
        //Method #3: Using Iterator and while loop.
        System.out.println("Using Iterator");
        Iterator<Map.Entry<String, Integer>> iterator = hashRaceResults.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Integer> raceEntry = iterator.next();
            System.out.println(raceEntry.getKey() + " :: " + raceEntry.getValue());
            //You can remove elements while iterating.
            iterator.remove();
        }
        
        //how to iterate through TreeMap and Display the key and mapped values
    }
}