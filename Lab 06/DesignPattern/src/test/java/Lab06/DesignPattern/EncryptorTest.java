package Lab06.DesignPattern;

import static org.junit.Assert.*;
import org.junit.Test;

public class EncryptorTest {
	Encryptor e = new Encryptor();
	
	@Test
	public void AES_Test(){
		System.out.println("AES Test");
		e.setPlainText("Shahzaib");
		assertEquals( (Object)"Shahzaib", e.runAlgorithm("AES"));
	}
	
	@Test
	public void BlowFish_Test(){
		System.out.println("BlowFish Test");
		e.setPlainText("Shahzaib");
		assertEquals( (Object)"Shahzaib", e.runAlgorithm("BlowFish"));
	}
	
	@Test
	public void TDES_Test(){
		System.out.println("TDES Test");
		e.setPlainText("Shahzaib Waseem");
		assertEquals( (Object)"Some Random Text", e.runAlgorithm("3DES"));
	}
}