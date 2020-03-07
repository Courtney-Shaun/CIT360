package Threads;
/* Threads enable a program to run more efficiently by executing multiple parts of it at the same time.
There are two mechanisms that can be used to create threads.
1.  Extending the Thread class.  Using this method prevents extending any other class because Java does not support multiple inheritance.
2.  Implement the Runnable interface.  This is the preferred method because the class can still extend other base classes.

Original code was written by Brother Tuckett and edited.
 */


// Makes this class into a thread
public class ThreadExample implements Runnable {

    // Declaring the variables to be used
    private String threadId;
    private int number;
    private int sleep;


    public ThreadExample(String threadId, int number, int sleep) {
        // setting the variables
        this.threadId = threadId;
        this.number = number;
        this.sleep = sleep;
    }
    // Method is required when class was turned into thread
    public void run() {
        System.out.println("\n\nExecuting with the following: Name = " + threadId +  " number = " + number
        + " Sleep = " + sleep + "/n/n");
        for (int count = 1; count < 10; count++) {
            if (count  <= number) {
                System.out.println(threadId + " is asleep. ");
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    System.err.println(e.toString());
                }
            }

        }
        System.out.println("\n\n" + threadId + " is finished.\n\n");

    }
}
