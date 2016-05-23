package SandboxCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Jae Dillree
 */
public class SampleList {
    public static void main(String[] args) {
        
        // create a list named RaceContestants
        List RaceContestants = new ArrayList();
        
        //add to the list
        RaceContestants.add("Bill");
        RaceContestants.add("Jim");
        RaceContestants.add("Sam");
        RaceContestants.add("Fred");
        RaceContestants.add("Bernie");
        RaceContestants.add("Sarah");
        RaceContestants.add("Tim");
        RaceContestants.add("Anna");
        
        // removing an element of the list by index
        RaceContestants.remove(3);
        
        // remove element by value or what the element actaully contains
        RaceContestants.remove("Tim");
        
        System.out.println(RaceContestants);
    }
}