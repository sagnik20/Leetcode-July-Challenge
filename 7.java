// Problem Name : Kth Smallest Element in a Sorted Matrix
// Link : https://leetcode.com/explore/featured/card/july-leetcoding-challenge-2021/608/week-1-july-1st-july-7th/3805/


class Solution {
    public int kthSmallest(int[][] m, int k1) {
        int l = m.length,k=0;
        int a[] = new int[l*l];
        for(int i=0;i<l;i++)
            for(int j=0;j<l;j++)
                a[k++]=m[i][j];
        Arrays.sort(a);
        return a[k1-1];
    }
}




// Other Approach


class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int l = matrix[0][0];
        int r = matrix[m-1][n-1];
        while(l <= r) {
            int mid = l+(r-l)/2;
            if(check(matrix, mid, k, n)) {
                r = mid -1;
            } else {
                l = mid+1;
            }
        }
        return l;
    }
    
    private boolean check(int[][] matrix, int mid, int k, int n) {
        int i = n - 1;
        int j = 0;
        int num = 0;
        while (i >= 0 && j < n) {
            if (matrix[i][j] <= mid) {
                num += i + 1;
                j++;
            } else {
                i--;
            }
        }
        return num >= k;

    }
}
