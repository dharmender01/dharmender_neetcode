class Solution {
    public int longestConsecutive(int[] nums) {
        int maxLength = 0;
        Set<Integer> set = new HashSet<>();

        for(int n : nums){
            set.add(n);
        }

        for(int i = 0; i < nums.length; i++){
            int length = 1;

            int j = i;

            if(!set.contains(nums[j]-1)){
                int temp = 1;
                while(set.contains(nums[i]+temp)){
                    length++;
                    temp++;
                }

            }

            maxLength = Math.max(maxLength,length);

        }

        return maxLength;

    }
}
