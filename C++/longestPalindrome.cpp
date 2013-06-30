#include <iostream>
#include <string>

using namespace std;

class Solution {
public:
	string longestPalindrome(string s) {
		int n = s.size();
		int len = 0, begin = -1, end = -1;
		for (int i = 0; i < n; ++ i) {
			int r = 0;
			for (r = 0; i - r >= 0 && i + r < n && s[i - r] == s[i + r]; ++ r);

			if (2 * r - 1 > len) {
				begin = i - r + 1;
				end = i + r - 1;
				len = 2 * r - 1;
			}
		}
		for(int i = 0; i < n - 1; i++){
			int r = 0;
			for(r = 0; i - r >= 0 && i + r + 1 < n && s[i - r] == s[i + r + 1]; ++r);

			if(2 * r > len){
				begin = i - r + 1;
				end = i + r;
				len = 2 * r;
			}
		}
		string res = s.substr(begin, len);
		return res;
  }
};

Solution sol;
int main() {
	string s;
	while (cin >> s)
		cout << sol.longestPalindrome(s) << endl;

	return 0;
}
