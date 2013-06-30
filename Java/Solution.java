

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class Solution {

	static class MyPair implements Comparable<MyPair> {
		private String s;
		private int count;
		
		public MyPair(String s, int i) {
			this.s = s;
			this.count = i;
		}
		@Override
		public int compareTo(MyPair o) {
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
	
    public static void main(String args[] ) throws Exception {
    	Map<String, Integer> map = new HashMap<String, Integer>();
    	Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		for (int i = 0; i < n; ++ i) {
			String s = sc.next();
			if(map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}
		ArrayList<MyPair> ap= new ArrayList<MyPair>();
		for (String key : map.keySet()) {
    		MyPair p = new MyPair(key, map.get(key));
    		ap.add(p);
    	}
		Collections.sort(ap);
		int k = sc.nextInt();
		for(int i = 0; i < k; i++) {
			System.out.println(ap.get(i).getS());
		}
    }
    
    
}
