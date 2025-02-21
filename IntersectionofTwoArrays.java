import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i], map.get(nums1[i])+1);
            }else{
                map.put(nums1[i],1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }

        Set<Integer> set = new HashSet<>(list);

        int ans[] = new int[set.size()];
        int i=0;
        for(int val:set){
            ans[i] = val;
            i++;
        }

        return ans;
    }
}



//==========Intersection of Two Arrays II

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
         Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i], map.get(nums1[i])+1);
            }else{
                map.put(nums1[i],1);
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i])>0){
                list.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }

        int ans[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i] = list.get(i);
        }

        return ans;
    }
}