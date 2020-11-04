package de.flowdmo;

public class MyThread extends Object implements Runnable{
	
	private final String text;

	public MyThread(String text) {
		
		this.text = text;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(text);
			try {Thread.sleep((long)(Math.random() *1000));} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
