class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //count of char + sum of asci of char (key, List<String))
        HashMap<String,List<String>> test = new HashMap<String,List<String>>();

        for(String s:strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);   
            
            if(test.containsKey(key)){
                test.get(key).add(s);
            }else{
            List<String> testing = new ArrayList<>();
            testing.add(s);
            test.put(key,testing);
            }
        }
       
        List<List<String>> output = new ArrayList<>();
        for(List<String> temp: test.values()){
            output.add(temp);
        }

        return output;

        
    }
}
