package SandboxCode;

/**
 *
 * @author Jae Dillree
 */
public class ThreadSleepSample {
    public static void main(String args[]) throws InterruptedException {
        String sampleText[] = {
            "This is the first thread and in 4 seconds you may see the next one",
            "This is the second thread and in another 4 another might follow",
            "By now hopefully you are seing a little bit about how this works,"
                + "if not maybe you will in another 4",
            "If you still don't get it, oh well keep studying"
        };

        for (int i = 0; i < sampleText.length; i++) {
            //Pause for 4 seconds
            Thread.sleep(4000);
            //Print a message
            System.out.println(sampleText[i]);
        }
    }
}
