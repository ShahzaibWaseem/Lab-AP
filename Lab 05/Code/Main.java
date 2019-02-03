import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Main {
public static void main(String[] args) throws IOException
{
	
	String type="AES",Key="Fuck You!",Data="Ali",encryptedData="", decryptedData="";
/*	int number, temp;
	ServerSocket s1 = new ServerSocket(1346);
	Socket ss = s1.accept();
	Scanner sc = new Scanner(ss.getInputStream());
	type = sc.nextLine();
	Key = sc.nextLine();
	String acknowledgement  = " Name and Key Recieved  Please Enter the Decoded Message";
	PrintStream p = new PrintStream(ss.getOutputStream());
	p.println(acknowledgement);
	encryptedData = sc.nextLine();
	System.out.println(type+" "+Key+" "+encryptedData);
	try {
		ss.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		s1.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
*/	Encryptor Encrypting  = MainStrategy.returnEncryptor(type);
	encryptedData = Encrypting.useStrategy(Data, Key);
	decryptedData = Encrypting.unuseStrategy(encryptedData, Key);
	System.out.println(decryptedData);
}
}
