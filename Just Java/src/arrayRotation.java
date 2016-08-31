import java.util.Arrays;
import java.util.Scanner;

public class arrayRotation {
	public static void main(String[] args) {
		// get input for program
		Scanner scanText = new Scanner(System.in);

		String textInput = new String();

		System.out.println("Your Input: ");
		textInput = rightPadZeros(scanText.nextLine(), 16);

		if (textInput.length() != 16) {
			System.out.println("Input cannot exceed 16 characters.");
		}

		else {
			// assign chars into cArray[][]
			char[][] cArray = new char[4][4];

			for (int i = 0; i < 4; ++i) {
				textInput.getChars(i * 4, (i * 4) + 4, cArray[i], 0);
			}

			// call rotate function and rotate array
			cArray = rotate(cArray);

			// display cArray output
			System.out.println("\nThe Array, Rotated: ");
			for (int i = 0; i <= 3; i++) {
				System.out.print("[");
				for (int j = 0; j <= 3; j++) {
					System.out.print(" " + cArray[i][j]);
				}
				System.out.println(" ]");
			}
			System.out.println();

			// convert array[][] to string & remove all symbols & printscreen
			String finalOutput = Arrays.deepToString(cArray).replaceAll("\\W", "");

			System.out.println("Final Output: ");
			System.out.println(finalOutput);
		}
		// close Scanner object
		scanText.close();
	}

	protected static String rightPadZeros(String str, int num) {
		return String.format("%1$-" + num + "s", str).replace(' ', '*');
	}

	protected static char[][] rotate(char[][] cArray) {
		int width = cArray[0].length;
		int depth = cArray.length;
		char[][] re = new char[width][depth];
		for (int i = 0; i < depth; i++) {
			for (int j = 0; j < width; j++) {
				re[j][depth - i - 1] = cArray[i][j];
			}
		}
		return re;
	}
}