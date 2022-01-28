
class MultithreadingDemo extends Thread 
{ 
    public void run() 
    { 
        try
        { 
            // Displaying the thread that is running 
            System.out.println ("Thread "+ 
                  Thread.currentThread().getId() + 
                  " is running"); 
  
        } 
        catch(Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    } 
} 

// Main Class 
public class Multithread 
{ 
    public static void main(String[] args) 
    { 
        //int n = 9; // Number of threads 
        for(int i=0; i<9; i++) 
        { 
            MultithreadingDemo object = new MultithreadingDemo(); 
            object.start(); 
        } 
    } 
}