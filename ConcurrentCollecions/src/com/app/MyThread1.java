package com.app;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyThread1 extends Thread{

	@SuppressWarnings("rawtypes")
	static CopyOnWriteArrayList l = new CopyOnWriteArrayList<>();
	@SuppressWarnings("unchecked")
	public void run()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Child Thread updating list");
		l.add("c");
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws InterruptedException {
		l.add("a");
		l.add("b");
		MyThread1 t = new MyThread1();
		t.start();
		Iterator itr = l.iterator();
		while(itr.hasNext())
		{
			String s = (String)itr.next();
			System.out.println("Main thread iterating and cueernt object is :"+s);
			Thread.sleep(3000);
		}
		System.out.println(l);
	}
}
