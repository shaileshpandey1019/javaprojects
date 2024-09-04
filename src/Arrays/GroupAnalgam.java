//package Arrays;
//
//
////    Given an array of strings strs, group the anagrams together. You can return the answer in any order.
////
////    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
////
////
////
////            Example 1:
////
////    Input: strs = ["eat","tea","tan","ate","nat","bat"]
////    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
//public class GroupAnagrams {
//    class Solution {
//        public List<List<String>> groupAnagrams(String[] strs) {
//            HashMap<String, List<String>> map = new HashMap<>();
//            for(String s: strs){
//                char[] chars=s.toCharArray();
//                Arrays.sort(chars);
//                String revString=new String(chars);
//
//                if (!map.containsKey(revString)){
//                    map.put(revString,new ArrayList<>());
//                }
//                map.get(revString).add(s);
//            } return new ArrayList<>(map.values());
//
//
//
//        }
//    }
//}
