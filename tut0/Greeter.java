import java.util.*;

public class Greeter {
	public static void main(String args[]) {
		String name = getName();
		System.out.println("The retrieved name is: " + name);
	}

	public static String getName() {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		return name;
	}
}
