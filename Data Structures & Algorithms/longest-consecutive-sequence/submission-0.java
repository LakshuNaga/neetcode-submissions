class Solution {
    public int longestConsecutive(int[] nums) {
        int count=0;
        int max=0;
        Set<Integer> set = new HashSet<>();

        for(int val:nums)
        {
            set.add(val);
        }

        
        for(int num:set)
        {
            if(!set.contains(num-1))
            {
                count=1;
                int x=num;

                while(set.contains(x+1))
                {
                    x++;
                    count++;
                }

            }
            max = Math.max(count,max);

        }
        
        return max;
    }
}
