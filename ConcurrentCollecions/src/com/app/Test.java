package com.app;

import java.util.concurrent.ConcurrentHashMap;

public class Test {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {

		ConcurrentHashMap m= new ConcurrentHashMap<>();
		m.put(101, "a");
		m.put(102, "b");
		m.putIfAbsent(103, "c");
		m.putIfAbsent(101, "a");
		m.remove(101, "d");
		m.replace(102, "b", "e");
		System.out.println(m);
	}

}
