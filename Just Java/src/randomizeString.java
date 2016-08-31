import java.security.SecureRandom;
import java.util.Random;

public class randomizeString {
	
	private static final Random RANDOM = new SecureRandom();
	
	/* Length of password. @see #generateRandomPassword() */
	public static final int passwordLength = 24;
	
	public static void main(String[] args) {
		
		System.out.println(generateRandomPassword());
	}

	/*
	 * Generate a random String suitable for use as a temporary password.
	 *
	 * @return String suitable for use as a temporary password
	 * @since 2.4
	 */

	public static String generateRandomPassword() {

		String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890~!@#$%^&*()_+";

		String pw = "";
		for (int i = 0; i < passwordLength; i++) {
			int index = (int) (RANDOM.nextDouble() * letters.length());
			pw = pw + letters.substring(index, index + 1);
		}
		return pw;
	}

}