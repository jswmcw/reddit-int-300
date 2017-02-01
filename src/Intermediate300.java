/**
 * 
 * @author JeremyW
 * https://www.reddit.com/r/dailyprogrammer/comments/5q9cll/20170126_challenge_300_easyintermediate_lets_make/
 *
 */
public class Intermediate300 {
	public static void main(String[] args) {
		final int ARRAYSIZE = Integer.parseInt(args[0]);
		int numberOfRows = Integer.parseInt(args[1]);
		int ruleNumber = Integer.parseInt(args[2]);
		String ruleBinary = String.format("%8s", Integer.toBinaryString(ruleNumber)).replace(' ', '0');
		StringBuilder theRow = new StringBuilder(ARRAYSIZE);
		StringBuilder oldRow = new StringBuilder(ARRAYSIZE);
		for (int i = 0; i < ARRAYSIZE; i++) {
			theRow.replace(i, i + 1, " ");
		}
		theRow.setCharAt(ARRAYSIZE / 2 + 1, '#');
		for (int i = 0; i < numberOfRows; i++) {
			System.out.println(theRow);
			oldRow.replace(0, ARRAYSIZE + 1, theRow.toString());
			for (int j = 0; j < ARRAYSIZE; j++) {
				char left, mid, right;
				mid = oldRow.charAt(j);
				if (j == 0) {
					left = oldRow.charAt(ARRAYSIZE - 1);
					right = oldRow.charAt(j + 1);
				}
				else if (j == ARRAYSIZE - 1) {
					left = oldRow.charAt(j - 1);
					right = oldRow.charAt(0);
				}
				else {
					left = oldRow.charAt(j - 1);
					right = oldRow.charAt(j + 1);
				}
				switch ("" + left + mid + right) {
					case "###":
						if (ruleBinary.charAt(0) == '1') theRow.setCharAt(j, '#');
						else theRow.setCharAt(j, ' '); 
						break;
					case "## ":
						if (ruleBinary.charAt(1) == '1') theRow.setCharAt(j, '#');
						else theRow.setCharAt(j, ' '); 
						break;
					case "# #":
						if (ruleBinary.charAt(2) == '1') theRow.setCharAt(j, '#');
						else theRow.setCharAt(j, ' '); 
						break;
					case "#  ":
						if (ruleBinary.charAt(3) == '1') theRow.setCharAt(j, '#');
						else theRow.setCharAt(j, ' '); 
						break;
					case " ##":
						if (ruleBinary.charAt(4) == '1') theRow.setCharAt(j, '#');
						else theRow.setCharAt(j, ' '); 
						break;
					case " # ":
						if (ruleBinary.charAt(5) == '1') theRow.setCharAt(j, '#');
						else theRow.setCharAt(j, ' '); 
						break;
					case "  #":
						if (ruleBinary.charAt(6) == '1') theRow.setCharAt(j, '#');
						else theRow.setCharAt(j, ' '); 
						break;
					case "   ":
						if (ruleBinary.charAt(7) == '1') theRow.setCharAt(j, '#');
						else theRow.setCharAt(j, ' '); 
						break;
				}
			}
		}
	}
}
