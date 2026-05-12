class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> map = new HashMap<>();

        for(int i = 0; i< strs.length; i++){
            
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            String s = String.valueOf(str);

            if(map.get(s) != null){
                List<String> ls = map.get(s);
                ls.add(strs[i]);
                map.put(s,ls);
            }else{
                List<String> ls = new ArrayList<>();
                ls.add(strs[i]);
                map.put(s,ls);
            }
        }  

        List<List<String>> res = new ArrayList<>(map.values());

        return res;

      

    }
}
