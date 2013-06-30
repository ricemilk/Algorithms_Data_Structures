import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Multiply {
    public static void main(String args[]) throws Exception {
    	ArrayList<Integer> ai = new ArrayList<Integer>();
    	Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int cnt = 0;
		long prod = 1;
		for (int i = 0; i < n; ++ i) {
			int num = sc.nextInt();
			if(num != 0) prod *= num;
			ai.add((Integer)num);
			if(num == 0) {
				cnt++;
			}
		}
		if(cnt > 1) {
			for(int i = 0; i < ai.size(); i++) {
				System.out.println(0);
			}
		} else if(cnt == 1) {
			for(int i = 0; i < ai.size(); i++) {
				if(ai.get(i) == 0) System.out.println(prod);
				else System.out.println(0); 
			}
		} else {
			for(int i = 0; i < ai.size(); i++) {
				System.out.println(prod / ai.get(i));
			}
		}
		
    }
}
