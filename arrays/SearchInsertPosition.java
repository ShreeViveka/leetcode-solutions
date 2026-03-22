class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int m=0,left=0,right=nums.length-1;
        while(left<=right){
            m=left+(right-left)/2;

            if(nums[m]==target){
                return m;
            }
            else if(target<nums[m])
             right=m-1;
            else
             left=m+1;
        }
       return left;
        
    }
}