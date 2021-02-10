package com.sysget.hachage;

public class Addition {

	public static void main(String[] args) {
		int a , b;
		a=3;
		b=4;
		System.out.println("l'addition entre " + a + " et " + b+ " font : "  + faireAddition(a, b) );
	}
	
	
   public static int faireAddition (int a , int b) {
	  return a + b;
   }

}
