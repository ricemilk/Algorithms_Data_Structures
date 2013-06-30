
import java.util.*;

import org.junit.Test;
import java.util.Scanner;

public class Comparator {
	@Test
	public void test() {
		Scanner in = new Scanner(System.in);
		Map<String, Integer>
		int n;
		n = in.nextInt();
		for (int i = 0; i < n; ++ i) {
			String s = in.next();
			
		}
		Arrays.sort(x);
		for (Pair p : x) {
			System.out.println(p.getS() + " " + p.getCount());
		}
	}
}

class Pair implements Comparable<Pair> {
	private String s;
	private int count;
	
	public Pair(String s, int i) {
		this.s = s;
		this.count = i;
	}
	@Override
	public int compareTo(Pair o) {
		if (count > o.count || (count == o.count && s.compareTo(o.s) < 0)) return -1;
		if (count < o.count || (count == o.count && s.compareTo(o.s) > 0)) return 1;
		return 0;
	}
	
	public String getS() {
		return s;
	}
	
	public int getCount() {
		return count;
	}
}
