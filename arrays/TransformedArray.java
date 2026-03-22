class TransformedArray {
    public int[] constructTransformedArray(int[] nums) {
        int[] res=new int[nums.length];
        int step;
        int s=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                step=(i+nums[i])%s;
                res[i]=nums[step];
            }
            else if(nums[i]<0){
                step=(i + nums[i] % s + s) % s;
                res[i]=nums[step];
            }
            else{
                res[i]=nums[i];                 
            }
        }
        return res;
        
    }
}