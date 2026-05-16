class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for(int i=0;i<strs.length;i++)
        {
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String sort = new String(arr);


            if(map.containsKey(sort))
            {
                map.get(sort).add(strs[i]);
            }
            else{
                map.put(sort, new ArrayList<>());
                map.get(sort).add(strs[i]);
            }
        }

        for(Map.Entry<String,List<String>> entry: map.entrySet())
        {
            res.add(entry.getValue());
        }

        return res;

        
    }
}
