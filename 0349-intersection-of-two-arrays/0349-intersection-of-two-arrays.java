class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap <Integer,Integer> map = new HashMap<>() ;
        List <Integer> res = new ArrayList<>();
        for(int i = 0 ; i < nums1.length ; i++){
            map.put(nums1[i] , map.getOrDefault(nums1[i],0)+1);
        }
        for(int i = 0 ; i < nums2.length ; i++){
            if (map.containsKey(nums2[i])) {
                res.add(nums2[i]);
                map.remove(nums2[i]); 
            }
        }

        int [] ar = new int [res.size()];
        for(int j = 0 ;  j < ar.length ; j++){
            ar[j]=res.get(j);
        }
        return ar ;
    }
}