package SlidingWindow;
//
//Problem Statement #
//Given a string, find the length of the longest substring in it with no more than K distinct characters.
//
//Example 1:
//
//Input: String="araaci", K=2
//Output: 4
//Explanation: The longest substring with no more than '2' distinct characters is "araa".
//Example 2:
//
//Input: String="araaci", K=1
//Output: 2
//Explanation: The longest substring with no more than '1' distinct characters is "aa".
//Example 3:
//
//Input: String="cbbebi", K=3
//Output: 5
//Explanation: The longest substrings with no more than '3' distinct characters are "cbbeb" & "bbebi".


import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinct {

    public static void findLongestSubstring(){
        String str="cbbebi";
        int K=3;

        int windowStart = 0;
        int maxLength = 0;

        Map<Character,Integer> frequencyMap = new HashMap();
        for(int windowEnd = 0; windowEnd < str.length(); windowEnd++){
            frequencyMap.put(str.charAt(windowEnd),frequencyMap.getOrDefault(str.charAt(windowEnd) ,0) + 1);

            while (frequencyMap.size() > K){
                frequencyMap.put(str.charAt(windowStart),frequencyMap.get(str.charAt(windowStart)) - 1);

                if(frequencyMap.get(str.charAt(windowStart)) == 0){
                    frequencyMap.remove(str.charAt(windowStart));
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength,windowEnd - windowStart + 1);
        }

        System.out.println("Longest substring length is "+maxLength);
    }

    public static void main(String[] args) {
        findLongestSubstring();
    }
}
