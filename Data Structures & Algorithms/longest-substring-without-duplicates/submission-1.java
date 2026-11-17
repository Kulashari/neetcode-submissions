class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        int left  = 0;
        for (int i = 0; i<s.length(); i++){
            char current = s.charAt(i);
            if (map.containsKey(current)){
                left = Math.max(left,map.get(current)+1); 
            }
            map.put(current,i);
            count = Math.max(count, i-left+1);
        }
        return count;
    }
}