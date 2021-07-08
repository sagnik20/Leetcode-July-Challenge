// Problem name: Maximum Length of Repeated Subarray
// Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge-2021/609/week-2-july-8th-july-14th/3807/


class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int max=0,c=0,a=nums1.length,b=nums2.length;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(nums1[i]==nums2[j]){
                    int k=i,l=j;
                    while ((k<a && l<b) && nums1[k]==nums2[l]){
                        c++;
                        k++;
                        l++;
                    }
                    if(max<c)max=c;
                    c=0;
                }
                if(a>b && max>(a/2))break;
                else if(b>a && max>b/2)break;
            }
        }
        return max;
    }
}
