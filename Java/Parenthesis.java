package careercup;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Parenthesis {
	public List<String> parenthesis(int n) {
		List<String> res = new ArrayList<String>();
		if(n == 0) {
			res.add("");
			return res;
		}
		List<String> resA = parenthesis(n - 1);
		for(int i = 0; i < resA.size(); ++i) {
			res.add("(" + resA.get(i) + ")");
		}
		
		for(int k = 0; k < n - 1; ++k) {
			List<String> resB = parenthesis(k);
			List<String> resC = parenthesis(n - k - 1);
			for(int i = 0; i < resB.size(); ++i) {
				for(int j =0; j < resC.size(); ++j) {
					res.add("(" + resB.get(i) + ")" + resC.get(j));					
				}
			}

		}
		return res;		
	}
	
	@Test
	public void test() {
		int n = 2;
		List<String> res = parenthesis(n);
		for(int i = 0; i < res.size(); ++i) {
			System.out.println(res.get(i));
		}
		System.out.println(res.size());
	}
}


