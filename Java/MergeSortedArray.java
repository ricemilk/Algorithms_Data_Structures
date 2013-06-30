import java.util.*;

public class MergeSortedArray {
    public void merge(int A[], int m, int B[], int n) {
        while(n > 0) {
    		if(m <= 0 || A[m - 1] < B[n - 1]) {
    			A[m + n - 1] = B[--n];
    		} else {
    			A[m + n - 1] = A[--m];
    		}
    	}
    }
}


//public void merge(int A[], int m, int B[], int n) {
//	while(n > 0) {
// wrong here, what is A array is empty.
//		if(m >= 0 || A[m - 1] > B[n - 1]) {
//			A[m + n - 1] = A[m - 1];
//			m--;
//		} else {
//			A[m + n - 1] = B[n - 1];
//			n--;
//		}
//	}
//}