package de.flowdmo;

import java.util.concurrent.Flow.Processor;
import java.util.concurrent.Flow.Subscription;
import java.util.concurrent.SubmissionPublisher;
import java.util.function.Function;



public class TransformProcessor<T,R> extends SubmissionPublisher<R> implements Processor<T, R> {
	
	
	private final Function<T,R> function;
	private Subscription subscription;
	
	
	

	public TransformProcessor(Function<T, R> function) {
		this.function = function;
	}

	@Override
	public void onSubscribe(Subscription subscription) {
		this.subscription = subscription;
        subscription.request(1);
		
	}

	@Override
	public void onNext(T item) {
		System.out.println("Transforming item: " + item);
		R retval = function.apply(item);
		if(retval != null)
			submit(retval);
        subscription.request(1);
		
	}

	@Override
	public void onError(Throwable throwable) {
		System.out.println("Upps");
		System.out.println(throwable.getMessage());
		
	}

	@Override
	public void onComplete() {
		close();
	}

}
