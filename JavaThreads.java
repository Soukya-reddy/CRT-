import java.io.*;
import java.util.*;
class ThreadImpl extends Thread
{
      @Override
      public void run()
    {
          String str = "Thread Class Implementation Thread"
                      + " is Running Successfully";
        System.out.println(str);
    }
}
class RunnableThread implements Runnable 
{    
      @Override
    public void run()
    {
          String str = "Runnable Interface Implementation Thread"
                      + " is Running Successfully";
        System.out.println(str);
    }

}

public class JavaThreads
{
    public static void main(String[] args)
    {
          ThreadImpl t1 = new ThreadImpl();
          t1.start();
        RunnableThread g2 = new RunnableThread();
        Thread t2 = new Thread(g2);
          t2.start();
          try {
              t1.join(); 
              t2.join();  
          } catch (InterruptedException e) {
              e.printStackTrace();
          }
    }
}