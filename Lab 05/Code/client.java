import java.io.IOException;
import java.io.PrintStream;
import java.net.UnknownHostException;
import java.net.Socket;
import java.util.Scanner;
import java.lang.String;

public class client {
	public static void main(String args[]) throws UnknownHostException, IOException {
		String algorithm, acknoledgement, key, text;

		Scanner scanner = new Scanner(System.in);

		Socket socket = new Socket("192.168.43.89", 1346);
		Scanner scannerSocket = new Scanner(socket.getInputStream());
		
		System.out.print("Enter Algorithm Type: ");
		algorithm = scanner.nextLine();

		Encryptor encrypting = MainStrategy.returnEncryptor(algorithm);

		System.out.print("Enter a Random Key: ");
		key = scanner.nextLine();

		System.out.print("Enter a String (Data): ");
		text = scanner.nextLine();

		PrintStream stream = new PrintStream(socket.getOutputStream());
		stream.println(algorithm);
		stream.println(key);

		acknoledgement = scannerSocket.nextLine();
		System.out.println(acknoledgement);

		String encryptedString = encrypting.useStrategy(text, key);

		int hashCode = encryptedString.hashCode();
		System.out.println("Hash Code: " + hashCode);

		stream.println(encryptedString);
		stream.println(hashCode);
	}	
}