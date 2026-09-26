class Solution {
    public int totalFruit(int[] fruits) {
        
        int l = 0 ; 
        int sum = 0 ; 
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int r = 0 ; r < fruits.length ; r++){
            int key_r = fruits[r];
            map.put(key_r,map.getOrDefault(key_r,0)+1);

            while(map.size() > 2){
                int key_l = fruits[l];
                map.put(key_l , map.get(key_l) - 1);
                
                if(map.get(key_l) == 0){
                    map.remove(key_l);
                }
                
                l++;
            }

            sum = Math.max(sum,r-l+1);

        }
        return sum ;
    }
}