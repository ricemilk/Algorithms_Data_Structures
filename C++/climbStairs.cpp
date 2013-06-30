class Solution {
public:
    int climbStairs(int n) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        vector<int> cnt(n+1);
        cnt[0] = cnt[1] = 1;
        for(int i = 2; i <= n; i ++)
            cnt[i] = cnt[i - 1] + cnt[i - 2];
        return cnt[n];
    }
};