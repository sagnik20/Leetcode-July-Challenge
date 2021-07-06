//Problem name: Reduce Array Size to The Half
//Link: https://leetcode.com/explore/challenge/card/july-leetcoding-challenge-2021/608/week-1-july-1st-july-7th/3804/


class Solution {
    public int minSetSize(int[] arr) {
       int target = arr.length/2; 
       int[] sizes = new int[100001];
       int max_size = 0; 
        
       for(int i = 0;i<arr.length;i++){
          sizes[arr[i]]+=1; 
          if(sizes[i] >= target) return 1; 
          if(max_size < arr[i]) max_size = arr[i]; 

       } 
        
       int[] counts = new int[50001];
       int max_count = 0;       
       for(int i = 1; i <=max_size  ; i++){
          counts[sizes[i]]+=1; 
          if(max_count < sizes[i]) max_count = sizes[i]; 
       } 
        
       
       int currCutted = 0;
       int currCuttedUniq = 0;
        
       for(int i = max_count; i > 0 ; i--){
          if(target < currCutted + counts[i] * i){
              return currCuttedUniq  + (target - currCutted+i-1)/i;
          } 
          currCutted += counts[i] * i;
          currCuttedUniq += counts[i];
              
       }
        
       return 0; 
    }
}
