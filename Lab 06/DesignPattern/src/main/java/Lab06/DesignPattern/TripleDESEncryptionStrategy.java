package Lab06.DesignPattern;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class TripleDESEncryptionStrategy implements EncryptionStrategy {
	private static final String ALGORITHM = "DESede";

	public String encryptData(String plainText, String keys) throws Exception {
		byte[] key = keys.getBytes();
		String IV = "12345678";
		SecretKeySpec spec = new SecretKeySpec(key, ALGORITHM);
		Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
		cipher.init(Cipher.ENCRYPT_MODE, spec, new javax.crypto.spec.IvParameterSpec(IV.getBytes()));
		return Base64.getEncoder().encodeToString(cipher.doFinal(plainText.getBytes("UTF-8")));
	}

	public String decryptData(String encryptedData, String keys) throws Exception {
		byte[] key = keys.getBytes();
		String IV = "12345678";
		SecretKeySpec spec = new SecretKeySpec(key, ALGORITHM);
		Cipher cipher = Cipher.getInstance("DESede/CBC/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, spec, new javax.crypto.spec.IvParameterSpec(IV.getBytes()));
		System.out.println("Decrypting");
		return new String(cipher.doFinal(Base64.getDecoder().decode(encryptedData)));
	}
}