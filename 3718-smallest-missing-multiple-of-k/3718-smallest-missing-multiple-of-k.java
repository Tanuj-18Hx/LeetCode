class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]%k==0){
                map.put(nums[i],1);
            }
        }
        int v = k ;
        while(map.containsKey(v)){
            v+=k;
        }
        return v ;
    }
}