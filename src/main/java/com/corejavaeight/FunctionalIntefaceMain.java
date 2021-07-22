package com.corejavaeight;

import com.corejavaeight.Printabe;

public class FunctionalIntefaceMain {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionalIntefaceMain fmain = new FunctionalIntefaceMain();
		fmain.printForm(()->System.out.print("Printing form"));
		
	}

	private void printForm(Printabe p) {
		// TODO Auto-generated method stub
		p.printForm();
		
	}
}
