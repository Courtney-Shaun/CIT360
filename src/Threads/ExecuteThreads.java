package Threads;

import java.util.concurrent.*;

public class ExecuteThreads {

    public static void main(String[] args) {

        // Sets the number of threads to be executed at the same time to 3
        ExecutorService threadExecute = Executors.newFixedThreadPool(3);

        //  Sets the parameters.  In my program the thread will sleep for the number of times listed in number for the
        // amount of milliseconds listed for sleep.
        ThreadExample te1 = new ThreadExample("Thread1", 40 , 1500);
        ThreadExample te2 = new ThreadExample("Thread2", 30, 1000);
        ThreadExample te3 = new ThreadExample("Thread3", 20, 750);
        ThreadExample te4 = new ThreadExample("Mason", 10, 500);
        ThreadExample te5 = new ThreadExample("Thread5", 5, 250);
        ThreadExample te6 = new ThreadExample("Thread6", 4, 50);

        // Executes the threads
        threadExecute.execute(te1);
        threadExecute.execute(te2);
        threadExecute.execute(te3);
        threadExecute.execute(te4);
        threadExecute.execute(te5);
        threadExecute.execute(te6);

        //  Needed to shutdown thread execution.
        threadExecute.shutdown();

    }
}
