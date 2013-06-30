class Solution {
public:
    void spiralOrder(vector<int> &res, vector<vector<int> > &matrix, int row1, int row2, int col1, int col2) {
        if (row1 > row2 || col1 > col2) return ;
        if (row1 == row2) {
            for (int c = col1; c <= col2; ++ c)
                res.push_back(matrix[row1][c]);
            return ;
        }
        if (col1 == col2) {
            for (int r = row1; r <= row2; ++ r)
                res.push_back(matrix[r][col1]);
            return ;
        }
        for (int c = col1; c <= col2; ++ c) res.push_back(matrix[row1][c]);
        for (int r = row1 + 1; r <= row2; ++ r) res.push_back(matrix[r][col2]);
        for (int c = col2 - 1; c >= col1; -- c) res.push_back(matrix[row2][c]);
        for (int r = row2 - 1; r > row1; -- r) res.push_back(matrix[r][col1]);
        spiralOrder(res, matrix, row1 + 1, row2 - 1, col1 + 1, col2 - 1);
    }
    vector<int> spiralOrder(vector<vector<int> > &matrix) {
        vector<int> res;
        int row = matrix.size();
        int col = (row > 0) ? matrix[0].size() : 0;
        spiralOrder(res, matrix, 0, row - 1, 0, col - 1);
        return res;
    }
};