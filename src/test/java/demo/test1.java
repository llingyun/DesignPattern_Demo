package demo;


public class test1 {
    public static void main(String[] args){
    	SyncThread syncThread1 = new SyncThread();
    	SyncThread syncThread2 = new SyncThread();
    	Thread thread1 = new Thread(syncThread1, "SyncThread1");
    	Thread thread2 = new Thread(syncThread2, "SyncThread2");
    	thread1.start();
    	thread2.start();
    }
}

class SyncThread implements Runnable {
	   private static int count;

	   public SyncThread() {
	      count = 0;
	   }

	   public  void run() {
	      synchronized(this) {
	         for (int i = 0; i < 5; i++) {
	            try {
	               System.out.println(Thread.currentThread().getName() + ":" + (count++));
	               Thread.sleep(100);
	            } catch (InterruptedException e) {
	               e.printStackTrace();
	            }
	         }
	      }
	   }
	   
	  synchronized  public void sum (){
		   int i = 1;
		   int sum = 0;
		   for(i = 1; i < 5; i++){
			   sum = sum + i;
			   System.out.println(Thread.currentThread().getName() + sum);
			   try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		   }
	   }

	   public int getCount() {
	      return count;
	   }
	}