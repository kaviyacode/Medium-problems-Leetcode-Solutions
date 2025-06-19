class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int count=1;//at least one subsequence
        int start=nums[0];//start from small
        for(int num:nums)
        {
            if(num-start>k)
            {
                count++;
                start=num;
            }
        }

    return count;    
    }
}