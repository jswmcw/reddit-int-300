/**
 * 
 * @author JeremyW
 * https://www.reddit.com/r/dailyprogrammer/comments/5q9cll/20170126_challenge_300_easyintermediate_lets_make/
 *
 */
import java.util.Arrays;
public class Intermediate300 {
	public static void main(String[] args) {
		final int ARRAYSIZE = Integer.parseInt(args[0]);
		int numberOfRows = Integer.parseInt(args[1]);
		int ruleNumber = Integer.parseInt(args[2]);
		String ruleBinary = String.format("%8s", Integer.toBinaryString(ruleNumber)).replace(' ', '0');
		String[] row = new String[ARRAYSIZE];
		String[] prevRow;
		Arrays.fill(row, " ");
		row[ARRAYSIZE / 2 + 1] = "#";
		for (int i = 0; i < numberOfRows; i++) {
			System.out.println(Arrays.toString(row));
			prevRow = row.clone();
			for (int j = 0; j < ARRAYSIZE; j++) {
				String left, mid, right;
				mid = prevRow[j];
				if (j == 0) {
					left = prevRow[ARRAYSIZE - 1];
					right = prevRow[j + 1];
				}
				else if (j == ARRAYSIZE - 1) {
					left = prevRow[j - 1];
					right = prevRow[0];
				}
				else {
					left = prevRow[j - 1];
					right = prevRow[j + 1];
				}
				switch (left + mid + right) {
					case "###":
						if (ruleBinary.charAt(0) == '1') row[j] = "#";
						else row[j] = " "; 
						break;
					case "## ":
						if (ruleBinary.charAt(1) == '1') row[j] = "#";
						else row[j] = " "; 
						break;
					case "# #":
						if (ruleBinary.charAt(2) == '1') row[j] = "#";
						else row[j] = " "; 
						break;
					case "#  ":
						if (ruleBinary.charAt(3) == '1') row[j] = "#";
						else row[j] = " "; 
						break;
					case " ##":
						if (ruleBinary.charAt(4) == '1') row[j] = "#";
						else row[j] = " "; 
						break;
					case " # ":
						if (ruleBinary.charAt(5) == '1') row[j] = "#";
						else row[j] = " "; 
						break;
					case "  #":
						if (ruleBinary.charAt(6) == '1') row[j] = "#";
						else row[j] = " "; 
						break;
					case "   ":
						if (ruleBinary.charAt(7) == '1') row[j] = "#";
						else row[j] = " "; 
						break;
				}
			}
		}
	}
}
