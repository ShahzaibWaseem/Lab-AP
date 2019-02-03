package Lab06.DesignPattern;

public class Encryptor {
	private String plainText;
	private String encryptedText;
	private String decryptedText;

	public void setPlainText(String text){
		plainText = text;
	}

	public void makeObject (String Algorithm) throws Exception{
		String key = "SomeKeyForAlgori";

		if (Algorithm.equals("AES")) {
			AESEncryptionStrategy AES = new AESEncryptionStrategy();
			encryptedText = AES.encryptData(plainText, key);
			System.out.println("The Encrypted Text is: " + encryptedText);
			
			decryptedText = AES.decryptData(encryptedText, key);
			System.out.println("The Decrypted Text is: " + decryptedText);
		}
		else if (Algorithm.equals("BlowFish")) {
			BlowFishEncryptionStrategy BF = new BlowFishEncryptionStrategy();
			encryptedText = BF.encryptData(plainText, key);
			System.out.println("The Encrypted Text is: " + encryptedText);
			
			decryptedText = BF.decryptData(encryptedText, key);
			System.out.println("The Decrypted Text is: " + decryptedText);
		}
		else if (Algorithm.equals("3DES")) {
			key = "SomeKeyForTrDESAlgorithm";
			TripleDESEncryptionStrategy TDES = new TripleDESEncryptionStrategy();
			encryptedText = TDES.encryptData(plainText, key);
			System.out.println("The Encrypted Text is: " + encryptedText);
			
			decryptedText = TDES.decryptData(encryptedText, key);
			System.out.println("The Decrypted Text is: " + decryptedText);
		}
		else {
			System.out.println("Enter a Valid Encryption Algorithm");
		}
	}

	public String runAlgorithm(String algorithm) {
		try{
			System.out.println("Making Object ...");
			makeObject(algorithm);
		} catch(Exception e){
			System.err.println(e);
		}
		return decryptedText;
	}
}