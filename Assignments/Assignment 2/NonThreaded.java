import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class NonThreaded {
	public void run () {
		TreeMap<Character, Integer> hashMap = new TreeMap<Character, Integer>();
        File file = new File("RandomStrings.txt");
        Scanner scanner = null;
		try {
			scanner = new Scanner(file,"utf-8");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        while (scanner.hasNext()) {
            char[] lines = scanner.nextLine().toCharArray();
            for (Character character : lines) {
                 if (hashMap.containsKey(character))
                    hashMap.put(character, hashMap.get(character) + 1);
                else
                    hashMap.put(character, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + "  :--------- " + entry.getValue());
        }
	}
}