package com.app;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class MyThread2 extends Thread{

	
	static ConcurrentHashMap<Integer, String> cp = new ConcurrentHashMap<>();
	
	public void run()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Child Thread updating Map");
		cp.put(103, "reddy");
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		cp.put(101, "ashok");
		cp.put(102, "vasari");
		MyThread2 t = new MyThread2();
		t.start();
		Set<Entry<Integer, String>> s = cp.entrySet();
		Iterator<Entry<Integer, String>> itr = s.iterator();
		while(itr.hasNext())
		{
			//Integer it = (Integer)itr.next();
			System.out.println("Main thread iterating and current thread is : "+itr.next());
			Thread.sleep(3000);
		}
		System.out.println(cp);
 	}
}
