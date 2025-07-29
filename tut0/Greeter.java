import java.util.*;

public class Greeter {
	public static void main(String args[]) {
		String myName = args[0];
		greeter(myName);
	}

	public static String getName() {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		return name;
	}

	public static void greeter(String name) {
		System.out.println("I am greeting this guy, the guy is called " + name);
	}
}
