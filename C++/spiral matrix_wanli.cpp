class Solution {
public:
    vector<int> spiralOrder(vector<vector<int> > &matrix) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        vector<int> res;
        int row = matrix.size();
        int column = (row > 0) ? matrix[0].size() : 0;  //pay attention
        int m = row, n= column;
        for(int r = 0; m > 0 && n > 0; r++){
            int i, j;
            for(i = r, j = r; j != column - r; j++){
                res.push_back(matrix[i][j]);
                if(j == column - r - 1) m--;
            }
            for(i++, j--; i != row - r && m > 0 && n > 0; i++){
                res.push_back(matrix[i][j]);
                if(i == row - r - 1) n--;
            }
            for(i--, j--; j >= r && m > 0 && n > 0; j--){
                res.push_back(matrix[i][j]);
                if(j == r) m--;        
            }
            for(i--, j++; i > r && m > 0 && n > 0; i--){
                res.push_back(matrix[i][j]);
                if(i == r + 1) n--;
            }
        }
        return res;
    }
};