class Solution {
    public int[] sortedSquares(int[] nums) {
        /*int n=nums.length;
        int [] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=nums[i]*nums[i];
        }
        Arrays.sort(res);
        return res;*/

        int n=nums.length;
        int[]res=new int [n];
        //two pointer:
        int left=0;
        int right=n-1;
        int index=n-1;
        
        while(left<=right){
            int leftsquared=nums[left]*nums[left];
            int rightsquared=nums[right]*nums[right];

            if(leftsquared>rightsquared){
                res[index]=leftsquared;
                left++;
            }
            else{
                res[index]=rightsquared;
                right--;
            }
            index--;
        }
        return res;
        
    }
}