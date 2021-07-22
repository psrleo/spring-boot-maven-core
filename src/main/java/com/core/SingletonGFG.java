package com.core;

class GFG {
	// private instance, so that it can be
	// accessed by only by getInstance() method
	private static GFG instance;

	private GFG() {
		// private constructor
	}

	public static GFG getInstance() {
		if (instance == null) {
			// synchronized block to remove overhead
			synchronized (GFG.class) {
				if (instance == null) {
					System.out.println("!!!!!!");
					// if instance is null, initialize
					instance = new GFG();
				}
			}
		}
		return instance;
	}
}

public class SingletonGFG {
	public static void main(String args[]) {
		GFG singleton = GFG.getInstance();
		GFG singleton2 = GFG.getInstance();
	}
}
