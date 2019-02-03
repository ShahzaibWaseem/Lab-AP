package Lab06.DesignPattern;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class AESEncryptionStrategy implements EncryptionStrategy {
	private static final String ALGORITHM = "AES";

	public String encryptData(String plainData, String key) throws Exception {
		SecretKeySpec skey = new SecretKeySpec(key.getBytes("UTF-8"), ALGORITHM);
		try {
			Cipher cipher = Cipher.getInstance(ALGORITHM);
			cipher.init(Cipher.ENCRYPT_MODE, skey);
			return Base64.getEncoder().encodeToString(cipher.doFinal(plainData.getBytes("UTF-8")));
		} catch (Exception e) {
			System.out.println("Error while encrypting: " + e.toString());
		}
		return null;
	}

	public String decryptData(String encryptedData, String key) throws Exception {
		SecretKeySpec skey = new SecretKeySpec(key.getBytes(), ALGORITHM);
		Cipher cipher = Cipher.getInstance(ALGORITHM);
		try {
			cipher.init(Cipher.DECRYPT_MODE, skey);
			return new String(cipher.doFinal(Base64.getDecoder().decode(encryptedData)));
		} catch (Exception e) {
			System.out.println("Error while encrypting: " + e.toString());
		}
		return null;
	}
}