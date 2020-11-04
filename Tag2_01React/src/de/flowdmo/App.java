package de.flowdmo;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.SubmissionPublisher;
import java.util.concurrent.TimeUnit;

public class App {

	public static void main(String[] args) throws Exception{
		
		new App().run();
	}
	
	
	
	private void run() throws Exception{
//		MyThread hund = new MyThread("wau");
//		MyThread katze = new MyThread("Miau");
//		MyThread maus = new MyThread("piep");
//		
//		ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
//		
//		service.execute(hund);
//		service.execute(katze);
//		
//		Future<Integer> future = service.submit(new SinnDesLebens());
//		service.execute(maus);
//		
//		service.shutdown();
//		
//		System.out.println("Vor beenden");
//		
//		int sinn = future.get();
//		
//		service.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
//		
//		System.out.println("nach beenden");
//		
		final List<String> items = List.of("1","x","2","3", "4");
		
		final var pool = ForkJoinPool.commonPool();
		
		
		
		final SubmissionPublisher<String> publisher = new SubmissionPublisher<String>(pool, 1);
		final TransformProcessor<String, Integer> transformProcessor = new TransformProcessor<>(this::myFunction);
		
		final EndSubscriber<Integer> subscriber = new EndSubscriber<>();
		
		publisher.subscribe(transformProcessor);
		transformProcessor.subscribe(subscriber);
		
		items.forEach(publisher::submit);
		
		publisher.close();
		
		System.out.println("a");
		pool.awaitTermination(Long.MAX_VALUE, TimeUnit.DAYS);
		System.out.println("b");
		
		
	}

	private Integer myFunction(String numberAsString) {
		try {
			return Integer.parseInt(numberAsString);
		} catch (NumberFormatException e) {
			System.out.println("Warning: " + numberAsString + " is not a Number");
			return null;
		}
	}


	class SinnDesLebens implements Callable<Integer> {

		@Override
		public Integer call() throws Exception {
			Thread.sleep(2000);
			return 42;
		}
		
	}

}
