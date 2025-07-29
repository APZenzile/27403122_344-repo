public class Greeter {
	public static void main(String args[]) {
		String myName = args[0];
		greeter(myName);
	}

	public static void greeter(String name) {
		System.out.println("I am greeting this guy, the guy is called " + name);
	}
}
