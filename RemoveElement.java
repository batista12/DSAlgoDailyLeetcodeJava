class Solution {
    public int removeElement(int[] nums, int val) {
        //just create a new expected index or result index 
        //and keep adding the values that are not equal to the given val

        int count =0;int t= nums.length;
        int expected_index = 0;
        for(int i=0; i< nums.length ;++i)
            {
                if(nums[i]!=val)
                    {nums[expected_index] = nums[i];
                    expected_index++; 
                    count++;} 
            }
            return count;
    }
}

Used the concept of expected index that could be the possible value when the desired elements are removed.
