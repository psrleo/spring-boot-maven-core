package com.core;

class SingletonTest  {
	private static SingletonTest singleton;

	private SingletonTest() {
	}

	public static SingletonTest getSingletonInstance() {
		if (singleton == null) {
			synchronized (SingletonTest.class) {
				if (singleton == null) {
				System.out.println("1111");
				singleton = new SingletonTest();
//				return new SingletonTest();
				}
			}
		} 
			return singleton;
	}
}

public class TestSingleton {
	public static void main(String args[]) {
		SingletonTest singleton = SingletonTest.getSingletonInstance();
		SingletonTest singleton2 = SingletonTest.getSingletonInstance();
	}
}
