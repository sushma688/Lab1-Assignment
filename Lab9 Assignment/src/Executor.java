
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class Executor {
	 public static void main(String args[]){
	       // ExecutorService executorService= Executors.newFixedThreadPool(2);
	       // ExecutorService executorService= Executors.newSingleThreadExecutor();
	       // ExecutorService executorService= Executors.newCachedThreadPool();
		 	ScheduledExecutorService executorService= Executors.newScheduledThreadPool(2);
	        Runnable task1=new RunnableChild("task1");
	        Runnable task2=new RunnableChild("task2");
	        Runnable task3=new RunnableChild("task3");
	        executorService.submit(task1);
	        executorService.submit(task2);
	        executorService.submit(task3);
	        executorService.schedule(task1,20, TimeUnit.SECONDS);
	        System.out.println("*******shutting down called");
	        executorService.shutdown();

	    }

}
