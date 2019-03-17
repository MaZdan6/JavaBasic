package org.zdanek.coursera;

public class CeasarCipher {
	
		static String alphabet="abcdefghijklmnopqrstuvwxyz";
	
	public static void main(String[] args) {
		
		String text="a bat";
		int p=19;
		System.out.println(text);
		
		String encryptedText=encryptText(text,p);
		System.out.println(encryptedText);
	}
	
	private static String encryptText(String text, int p) {
		
		StringBuilder sb= new StringBuilder("");
		String shiftedAlphabet= shiftAlphabet(p);
		System.out.println(alphabet);
		System.out.println(shiftedAlphabet);
		
		char[] chars=text.toCharArray();
		char encryptedChar=' ';
		for(char i:chars) {
			int alphabetIndex= alphabet.indexOf(i);
			if(alphabetIndex==-1) {
				encryptedChar=' ';
			}else {
				encryptedChar= shiftedAlphabet.charAt(alphabetIndex);
			}
			
			sb.append(encryptedChar);
		}
		
		String encryptedText=sb.toString();
		return encryptedText;
		// TODO Auto-generated method stub
		
	}

	private static String shiftAlphabet(int p) {
		
		String shiftedAphabet= alphabet.substring(p);
		shiftedAphabet=shiftedAphabet+alphabet.substring(0, p);
		
		return shiftedAphabet;
	}
	
	
}
