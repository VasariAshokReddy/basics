package com.app;

//java.lang.UnsupportedOperationException remove method will not support for COWAL
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWALEx {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		CopyOnWriteArrayList cl = new CopyOnWriteArrayList<>();
		cl.add("a");
		cl.add("b");
		cl.add("c");
		System.out.println(cl);
		Iterator itr = cl.iterator();
		while(itr.hasNext())
		{
			String s = (String)itr.next();
			if(s.equals("c"))
				itr.remove();
		}
		System.out.println(cl);
	}

}
