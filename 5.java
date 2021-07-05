// Problem name : Reshape the Matrix
// Link : https://leetcode.com/explore/challenge/card/july-leetcoding-challenge-2021/608/week-1-july-1st-july-7th/3803/



class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length,a=0,b=0,n=mat[0].length;
        int mat1 [][] = new int[r][c];
        if(m*n!=r*c)return mat;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat1 [a][b] = mat[i][j];
                if(b==c-1){
                    b=0;
                    a++;
                }
                else
                    b++;
                
            }
        }
        return mat1;
    }
}
