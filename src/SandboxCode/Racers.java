/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SandboxCode;

import java.io.Serializable;

/**
 *
 * @author Jae Dillree
 */
public class Racers implements Serializable {
   private int id;
   private String firstName; 
   private String lastName;   
   private double elapsedTime; 
   private int position; 

    Racers() {
    }

   public int getId() {
      return id;
   }
   public void setId( int id ) {
      this.id = id;
   }
   
   public String getFirstName() {
      return firstName;
   }
   public void setFirstName( String first_name ) {
      this.firstName = first_name;
   }
   public String getLastName() {
      return lastName;
   }
   public void setLastName( String last_name ) {
      this.lastName = last_name;
   }
   public double getElapsedTime() {
      return elapsedTime;
   }
   public void setElapsedTime(double elapsedTime ) {
      this.elapsedTime = elapsedTime;
   }
public int getPosition() {
      return position;
   }
   public void setPosition( int position ) {
      this.position = position;
   }

    public void displayRacer() {
        System.out.print("ID:" + this.id);
        System.out.print("First Name:" + this.firstName);
        System.out.print("Last Name:" + this.lastName);
        System.out.print("Elapsed Time:" + this.elapsedTime);
        System.out.print("Position:" + this.position);
    }
}
