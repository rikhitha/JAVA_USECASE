package lab.java.two.com;

public class thread_id_39 {

	public static void main(String[] args)
	{
		Thread t1 = new Thread(new NumberRunnable(), "T1");
	    Thread t2 = new Thread(new NumberRunnable(), "T2");
	    Thread t3 = new Thread(new NumberRunnable());
	    // setting name using setName method
	    t3.setName("Thread3");
	    t1.start();
	    t2.start();
	    t3.start();
	}

}
class NumberRunnable implements Runnable{
	  @Override
	  public void run() {   
	    
	    System.out.println("Current Thread Name- " + Thread.currentThread().getName());
	    
	    System.out.println("Current Thread ID- " + Thread.currentThread().getId() + " For Thread- " + Thread.currentThread().getName());                       
	  }
	}
