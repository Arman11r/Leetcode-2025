class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sCount = new HashMap<>();
        HashMap<Character, Integer> tCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            sCount.put(s.charAt(i), 1 + sCount.getOrDefault(s.charAt(i), 0));
            tCount.put(t.charAt(i), 1 + tCount.getOrDefault(t.charAt(i), 0));
        }

        return sCount.equals(tCount);        
    }
}


// import java.util.HashMap;

// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if (s.length() != t.length()) return false;
        
//         HashMap<Character, Integer> freqMap = new HashMap<>();
        
//         for (char c : s.toCharArray()) {
//             freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
//         }
        
//         for (char c : t.toCharArray()) {
//             if (!freqMap.containsKey(c)) return false;
//             freqMap.put(c, freqMap.get(c) - 1);
//             if (freqMap.get(c) == 0) freqMap.remove(c);
//         }
        
//         return freqMap.isEmpty();
//     }
// }