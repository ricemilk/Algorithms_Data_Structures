class Solution {
public:
    int minimumTotal(vector<vector<int> > &triangle) {
        int m = triangle.size();
        for(int i = 1; i != m; i++){
            for(int j = 0; j != triangle[i].size(); j++){
                if(j == 0)
                    triangle[i][j] += triangle[i - 1][j];
                else if(j == triangle[i].size() - 1)
                    triangle[i][j] += triangle[i - 1][j - 1];
                else    
                    triangle[i][j] += min(triangle[i - 1][j], triangle[i - 1][j - 1]);
            }
        }
        int n = triangle[m - 1].size();
        int Min = 1<<30;
        for(int i = 0; i != n; i++){
            if(triangle[m - 1][i] < Min)
                Min = triangle[m - 1][i];
        }
        return Min;
    }
};