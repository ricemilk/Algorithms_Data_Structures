
int max_subarray(int A[], int n){
    int f = 0, dp = -(1<<30);
    for(int i = 0; i < n; i ++){
        f = max(f, 0) + A[i];
        dp = max(f, dp);
    }
    return dp;
}

//f[i] means a continous subarray that max_sum and must be ending with A[i]
//dp[i] means a continious subarray that max_sum from 0-i
//f[i] = A[i] if f[i-1]< 0;
//     = f[i-1] + A[i] others

//dp[i] =f[i] if including A[i];
//      =dp[i-1] others(Dynamic Programming)