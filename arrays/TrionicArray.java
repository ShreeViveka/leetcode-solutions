import java.util.Arrays;
class TrionicArray {
    public boolean isTrionic(int[] nums) {
        int n=nums.length,p1=0;
        if(n<3) return false;
        while(p1<n-1 && nums[p1]<nums[p1+1]) p1++;
        if(p1==0 || p1==n-1) return false;
        int p2=p1;
        while(p2<n-1 && nums[p2]>nums[p2+1]) p2++;
        if(p2==n-1) return false;
        int p3=p2;
        while(p3<n-1 && nums[p3]<nums[p3+1]) p3++;
        return p3==n-1;


    }
        
}