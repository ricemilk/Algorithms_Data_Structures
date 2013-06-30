import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class CircularBuffer {
    public static void main(String args[] ) throws Exception {
    	Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		String[] array= new String[N];
		int head = 0;
		int size = 0;
		while(true) {
			String operate = sc.next();
			if(operate.equals("A")) {
				int num = Integer.parseInt(sc.next());
				for(int i = 0; i < num; i++) {
					String s = sc.next();
					array[(head + size + i) % N] = s;
				}
				if(size + num > N) {
					head += size + num;
					head %= N;
					size = N;
				} else {
					size += num;
				}
			} else if(operate.equals("R")) {
				int num = Integer.parseInt(sc.next());
				head += num;
				head %= N;
				size -= num;
			} else if(operate.equals("L")) {
				for(int i = 0; i < size; i++) {
					System.out.println(array[(head + i) % N]);
				}
			} else {
				break;
			}	
		}		
    }
}
