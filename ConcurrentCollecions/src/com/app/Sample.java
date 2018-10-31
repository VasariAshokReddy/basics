package com.app;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Sample {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		ArrayList al = new ArrayList<>();
		al.add("a");
		al.add("b");
		
		CopyOnWriteArrayList cl = new CopyOnWriteArrayList<>();
		cl.add("a");
		cl.add("c");
		cl.addIfAbsent(al);
		ArrayList al2 = new ArrayList<>();
		al2.add("a");
		al2.add("e");
		cl.addAllAbsent(al2);
		System.out.println(cl);
	}

}
