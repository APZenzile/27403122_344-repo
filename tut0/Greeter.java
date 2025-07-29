import java.util.*;

/**
 * this class is a greeting class
 * and provides various ways of greeting.
 */
public class Greeter {

	/**
	 * and this is a standard main java function.
	 * @param args
	 */
	public static void main(String args[]) {
		greeter();
	}

	/**
	 * This function retrieves a name from the command line and 
	 * @return returns the name.
	 */
	public static String getName() {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		return name;
	}

	/**
	 * this function is greeting function.
	 */
	public static void greeter() {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();

		System.out.println("I am greeting this guy, the guy is called " + name);
	}
}
