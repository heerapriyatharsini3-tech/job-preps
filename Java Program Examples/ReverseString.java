
public class ReverseString {
	public static void main(String[] args) {
		String str = "Apple";

		// Calling the reverse function
		System.out.println(FnReverse(str));
	}

	// Function to reverse the input string
	public static String FnReverse(String inputString) {
		if (inputString == null) {
			throw new IllegalArgumentException("Null is not valid input");
		}

		// StringBuilder outputString = new StringBuilder();
		String outputString = "";
		char[] chars = inputString.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--) {
			// outputString.append(chars[i]);
			outputString = outputString + chars[i];
		}
		return outputString.toString();
	}
}
