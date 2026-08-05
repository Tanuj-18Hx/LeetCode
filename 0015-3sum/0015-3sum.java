class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>() ;
        Arrays.sort(nums);

        for(int i = 0 ; i<= nums.length - 3 ; i++){
            int trg = 0 - nums[i];
            int left = i+1 ;
            int right = nums.length-1 ;
            if(i>0 && nums[i]==nums[i-1]) continue ;
            while(left<right){
                int sum = nums[left] + nums[right];
                if(sum==trg){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    list.add(temp);
                    left++;
                    right--;
                    while(left>0 && left<right && nums[left] == nums[left-1]) left++;
                    while(right < nums.length-1 && left<right && nums[right] == nums[right + 1]) right--;
                }
                else if(sum < trg) left++;
                else right-- ;
            }

        }

        return list ;
    }
}