package com.app;

import java.util.ArrayList;
import java.util.Iterator;

public class MyThread extends Thread{
	@SuppressWarnings("rawtypes")
	static ArrayList l = new ArrayList();

	@SuppressWarnings("unchecked")
	public void run()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}

			System.out.println("Child Thread updating list");
			l.add("d");
		
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws InterruptedException {
		
		l.add("a");
		l.add("b");
		l.add("c");
		MyThread t = new MyThread();
		t.start();
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			String s = (String)itr.next();
			System.out.println("Main thread iterating list and current object id :"+s);
			Thread.sleep(3000);
		}
		System.out.println(l);
	}
}
