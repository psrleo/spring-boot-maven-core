package corejavaeightadded;

public class FunctionalCheckImpl implements FunctionalCheck{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionalCheck  fc = (str)->"apple";
//		String doable = fc.doable("ball");	
		System.out.println(fc.doable("ball"));
		
//		FunctionalCheck  fc1 = new FunctionalCheck() {
//				
//				public String doable(String str) {
//			
//			return str;
//			
//		}};
//				String str= fc1.doable("Ingeneous");
//				System.out.println(str);
		
	}

	public  String doable(String str) {
		// TODO Auto-generated method stub
		System.out.println(str);
		return str;
		
	}
}
