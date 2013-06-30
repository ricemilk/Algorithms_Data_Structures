package careercup;

import java.util.ArrayList;

import org.junit.Test;

public class Permutation {
	public static ArrayList<String> permutation(String str) {
		ArrayList<String> result = new ArrayList<String>();
		if(str.length() == 0) {
			result.add("");
		}
		if(str.substring(1).equals("")) {
			return result;
		}

		ArrayList<String> res = permutation(str.substring(1));
		result.addAll(insert(str.charAt(1), res));
		return result;
	}
	
	public static ArrayList<String> insert(char c, ArrayList<String> res) {
		ArrayList<String> newRes = new ArrayList<String>();
		for(int i = 0; i < res.size(); ++i) {
			for(int j = 0; j < res.get(0).length(); ++j) {
				String front = res.get(i).substring(0, j);
				String end = res.get(i).substring(j);
				newRes.add(front + c + end);
			}
		}
		return newRes;
	}
	
	@Test
	public void testPerm() {
		String str = "abc";
		ArrayList<String> result = permutation(str);
		for (String string : result) {
            System.out.println(string);
        }
	}
}
