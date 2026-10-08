class Solution {
    public java.util.List<java.util.List<String>> groupAnagrams(String[] strs) {

        java.util.HashMap<String, java.util.List<String>> map =
            new java.util.HashMap<>();

        for (int i = 0; i < strs.length; i++) {

            char[] chars = strs[i].toCharArray();

            java.util.Arrays.sort(chars);

            String key = new String(chars);

            if (!map.containsKey(key)) {
                map.put(key, new java.util.ArrayList<>());
            }

            map.get(key).add(strs[i]);
        }

        return new java.util.ArrayList<>(map.values());
    }
}