package com.sysget.hachage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashMDPDemo {
	public static String md5(String hashstring) throws NoSuchAlgorithmException {
		 String password = hashstring;

	        MessageDigest md = MessageDigest.getInstance("MD5");
	        md.update(password.getBytes());

	        byte byteData[] = md.digest();

	        //convertir le tableau de bits en une format hexadécimal - méthode 1
	        StringBuffer sb = new StringBuffer();
	        for (int i = 0; i < byteData.length; i++) {
	         sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
	        }
		   return sb.toString();
	  }
	
}
