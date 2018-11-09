import java.util.Scanner;

public class IBeforeERule {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word to be checked for the I before e rule");
		String word = scan.nextLine();
		checkWord(word);
	}
	
	private static void checkWord(String word) {
		if (word.contains("cie")) {
			System.out.println("False");
			return;
		}
		if (word.contains("ie")) {
			System.out.println("True");
			return;
		}
		if (word.contains("cei")) {
			System.out.println("True");
			return;
		}
		System.out.println("False");
	}

}
