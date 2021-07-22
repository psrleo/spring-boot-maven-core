package com.core;

import java.util.HashMap;

public class HashMapSizeTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hm = new HashMap();
//		hm.put("Suyog", "yes");
//		hm.put("SUYOG", "yes1");
//		hm.put("SuyoG", "ye2");
		
		hm.put("Suyog", "yes");
		hm.put("Suyog", "yes1");
		hm.put("Suyog", "ye2");
//		
//		hm.put(new MyStringKeyWrapper("Suyog"), "yes");
//		hm.put(new MyStringKeyWrapper("SUYOG"), "yes1");
//		hm.put(new MyStringKeyWrapper("SuyoG"), "ye2");
		
		System.out.println(hm.size());
		
		
	}
}

class MyStringKeyWrapper {
	
	private String s;
	public MyStringKeyWrapper(String str) {
		this.s= str;
		System.out.println(s);
		
	}
	
	@Override
    public int hashCode() {     
        return 20;
    }
 
    @Override
    public boolean equals(Object obj) {
        return false;
    }
}

