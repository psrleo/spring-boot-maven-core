package corejavaeightadded;

public class FunctionalStringCheckImpl {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionalStringCheck fsc = (str)->str;
//		String str2 = (String)fsc.check("apple2");
		System.out.println(fsc.check("apple2"));
		
		
		FunctionalStringCheck fsc2 = i->i ;
//		Integer i1 = (Integer)fsc2.check(33);
		System.out.println(fsc2.check(33));
	}
}
