package Lab06.DesignPattern;

public interface EncryptionStrategy {
	public String encryptData(String plainData,String key) throws Exception;
	public String decryptData(String encryptedData,String key) throws Exception;
}