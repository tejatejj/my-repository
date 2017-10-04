import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyboardInput {
	
	public static void main(String...args) {
		
		String s;
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(ir);
		System.out.println("Unix");
		
		try {
			s = in.readLine();
			while(s != null) {
				System.out.println("Read: "+s);
				s = in.readLine();
			}
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
