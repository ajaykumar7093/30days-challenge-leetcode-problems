class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int left=0;
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
         if(map.containsKey(s.charAt(i))){
            left=Math.max(left,map.get(c)+1);
           
         }
          map.put(s.charAt(i),i);
         max=Math.max(max,i-left+1);
        

            

        }
        return max;
        
    }
}