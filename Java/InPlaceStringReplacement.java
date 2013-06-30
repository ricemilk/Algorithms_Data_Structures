package careercup;

public class InPlaceStringReplacement {
	public void replaceSpaces(char[] str, int length) {
		// space count
		int spaceCount = 0;
		for (int i = 0; i < length; i++) {
			if (str[i] == ' ') {
				spaceCount++;
			}
		}

		// write back forward
		int newLength = length + spaceCount * 2;
		int pointer = newLength;
		str[newLength] = '\0';
		for (int i = length - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[pointer - 1] = '0';
				str[pointer - 2] = '2';
				str[pointer - 3] = '%';
				pointer -= 3;
			} else {
				str[pointer - 1] = str[i];
				pointer--;
			}
		}

	}

	public static void main() {
		InPlaceStringReplacement re = new InPlaceStringReplacement();
		String s = "13412432143214 32142143 ";
		char[] str1 = new char[3 * s.length() + 1];

		for (int i = 0; i < s.length(); ++i) {
			str1[i] = s.charAt(i);
		}

		re.replaceSpaces(str1, s.length());
		System.out.println(str1);
	}
}
