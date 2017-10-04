import java.util.Scanner;

public class ScanTest {

	public static void main(String...args) {
		
		Scanner sc = new Scanner(System.in);
		String value1 = sc.next();
		System.out.println("value 1 = "+value1);
		int value2 = sc.nextInt();
		System.out.println("Value 2 = "+value2);
		sc.close();
	}
}
