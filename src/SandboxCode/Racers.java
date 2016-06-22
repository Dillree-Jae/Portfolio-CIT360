/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SandboxCode;

/**
 *
 * @author Jae Dillree
 */
public class Racers {
   private int id;
   private String firstName; 
   private String lastName;   
   private int elapsedTime; 
   private int position; 

   public Racers(String fname, String lname, int time, int pos) {
      this.firstName = fname;
      this.lastName = lname;
      this.elapsedTime = time;
      this.position= pos;
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
   public int getElapsedTime() {
      return elapsedTime;
   }
   public void setElapsedTime( int elapsedTime ) {
      this.elapsedTime = elapsedTime;
   }
public int getPosition() {
      return position;
   }
   public void setPosition( int position ) {
      this.position = position;
   }
}
