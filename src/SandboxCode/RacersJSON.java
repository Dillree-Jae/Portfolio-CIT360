/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SandboxCode;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Jae Dillree
 */
public class RacersJSON {
    public static void main (String[] args) throws IOException {
        
        // initialize three instances of Racers
        Racers racer1 = new Racers();
        Racers racer2 = new Racers();
        Racers racer3 = new Racers();
        
        // Set First Racer Values
        racer1.setId(1);
        racer1.setFirstName("Charles");
        racer1.setLastName("Whitmore");
        racer1.setElapsedTime(23.20);
        racer1.setPosition(3);
        
        // Set Second Racer Values
        racer2.setId(2);
        racer2.setFirstName("Hulk");
        racer2.setLastName("Hogan");
        racer2.setElapsedTime(21.01);
        racer2.setPosition(1);
        
        // Set Third Racer Values
        racer3.setId(3);
        racer3.setFirstName("Johnny");
        racer3.setLastName("Cage");
        racer3.setElapsedTime(21.99);
        racer3.setPosition(2);
        
        // Show the Racers info before it has been serialized
        System.out.println("Racer info before serialization");
        System.out.println("======================================");
        System.out.println("Racer 1");
        racer1.displayRacer();
        System.out.print("\n");
        System.out.println("Racer 2");
        racer2.displayRacer();
        System.out.print("\n");
        System.out.print("Racer 3");
        racer3.displayRacer();
        
        
        // Intitialize a Google GSON Object Instance
        Gson racerJSON = new Gson();
        String race1, race2, race3;
        
        // Make the Racers instances serialized
        race1 = racerJSON.toJson(racer1);
        race2 = racerJSON.toJson(racer2);
        race3 = racerJSON.toJson(racer3);

        
        // Show the serialized Racers object info
        System.out.println("\n\nThis is what the Racers objects look like serialized");
        System.out.println("==================================");
        System.out.println(race1);
        System.out.println(race2);
        System.out.println(race3);
        
        // Save the data in serialized form to a file
        try (BufferedWriter racerBuff = new BufferedWriter(new FileWriter("racerJSON.json"))) {
            racerBuff.write(race1);
            racerBuff.newLine();
            racerBuff.write(race2);
            racerBuff.newLine();
            racerBuff.write(race3);
            racerBuff.close();
        }
        
// Get serialized data from file we created and stored it in previously
        String raceNew1 = new String();
        String raceNew2 = new String();
        String raceNew3 = new String();
        try (BufferedReader racerBuff2 = new BufferedReader(new FileReader("racerJSON.json"))) {
            raceNew1 = racerBuff2.readLine();
            raceNew2 = racerBuff2.readLine();
            raceNew3 = racerBuff2.readLine();
        } 
        
        // Display data from file still serialized
        System.out.println("\n\nSerialized data retrieve from file");
        System.out.println("=======================================");
        System.out.println(raceNew1);
        System.out.println(raceNew2);
        System.out.println(raceNew3);
        
        // Deserialize the Racers data
        Racers newRacer1 = racerJSON.fromJson(raceNew1, Racers.class);
        Racers newRacer2 = racerJSON.fromJson(raceNew2, Racers.class);
        Racers newRacer3 = racerJSON.fromJson(raceNew3, Racers.class);
        
        // Show data deserialized back to original Java form
        System.out.println("\n");
        System.out.println("Data deserialized back to original Java form");
        System.out.println("===============================================");
        System.out.println("Racer 1");
        newRacer1.displayRacer();
        System.out.print("\n");
        System.out.println("Racer 2");
        newRacer2.displayRacer();
        System.out.print("\n");
        System.out.println("Racer 3");
        newRacer3.displayRacer();
    }
}