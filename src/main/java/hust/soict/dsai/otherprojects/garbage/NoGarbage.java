package hust.soict.dsai.otherprojects.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class NoGarbage {
    public static void main(String[] args) throws IOException {
		String filename = "text.txt";
		byte[] inputBytes = {0};
		long startTime, endTime;	
		
		inputBytes = Files.readAllBytes(Paths.get(filename));
		startTime = System.currentTimeMillis();
		StringBuffer mybuffer = new StringBuffer();
		for (byte b: inputBytes) {
			mybuffer.append((char)b);
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime); 
	}	
}
