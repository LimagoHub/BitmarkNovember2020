package de.services.impl;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.SubmissionPublisher;

import de.services.StringPublisher;
import de.sources.StringSource;

public class StringPublisherImpl extends SubmissionPublisher<String> implements StringPublisher{
	
	private final List<String> strings = StringSource.getInstance().findStrings();
	
	
	public StringPublisherImpl() {
		super(ForkJoinPool.commonPool(), 1);
	}
	
	@Override
	public void start() {
		strings.forEach(this::submit);
		close();
	}

	
	
	

}
