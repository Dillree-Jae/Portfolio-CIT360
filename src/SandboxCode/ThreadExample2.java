
package SandboxCode;

/**
 *
 * @author Jae Dillree
 */
public class ThreadExample2 implements Runnable {
   public void run(){  
     System.out.println("Thread is now running..");  
   }  
   public static void main(String[] args) {
     (new Thread(new ThreadExample2())).start();
}
}
