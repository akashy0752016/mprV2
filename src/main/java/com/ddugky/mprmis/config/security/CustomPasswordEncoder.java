package com.ddugky.mprmis.config.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.util.ResourceUtils;

public class CustomPasswordEncoder implements PasswordEncoder {
	
	@Override
	public String encode(CharSequence rawPassword) {
		// TODO Auto-generated method stub
		try {
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return rawPassword.toString();
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		// TODO Auto-generated method stub
		String[] passString = rawPassword.toString().split("@");		
		return passString[0].replaceAll("0", "").contentEquals(checkEncriptedSaltedsha256Password(encodedPassword.toString(), passString[1].replaceAll("-", "")));
	}
	
	public static String checkEncriptedSaltedsha256Password(String existingPassword,
			String sessionSalt) {
		String saltedPassword = existingPassword + sessionSalt;
		byte[] defaultBytes = saltedPassword.getBytes();
	    try{
	        MessageDigest digest = MessageDigest.getInstance("SHA-256");
	        byte[] hash = digest.digest(defaultBytes);
	        StringBuffer hexString = new StringBuffer();

	        for (int i = 0; i < hash.length; i++) {
	            String hex = Integer.toHexString(0xff & hash[i]);
	            if(hex.length() == 1) hexString.append('0');
	            hexString.append(hex);
	        }
	        saltedPassword = hexString+"";
	        saltedPassword = saltedPassword.replaceAll("0", "");
	        return saltedPassword.toString();
	    } catch(Exception ex){
	       throw new RuntimeException(ex);
	    }
	}
	
	String checkEncriptedSaltedMD5Password(String existingPassword,
			String sessionSalt) {

		String saltedmd5Password = existingPassword + sessionSalt;
		byte[] defaultBytes = saltedmd5Password.getBytes();

		try {
			MessageDigest algorithm = MessageDigest.getInstance("MD5");
			algorithm.reset();
			algorithm.update(defaultBytes);
			byte messageDigest[] = algorithm.digest();
			StringBuffer hexString = new StringBuffer();

			for (int i = 0; i < messageDigest.length; i++) {
				hexString.append(Integer.toHexString(0xFF & messageDigest[i]));
			}
			String foo = messageDigest.toString();
			saltedmd5Password = hexString + "";
		} catch (NoSuchAlgorithmException nsae) {
		}
		saltedmd5Password = saltedmd5Password.replaceAll("0", "");
//		//System.out.println("DataBase Password--> "+saltedmd5Password);
		return saltedmd5Password;
	}
}
