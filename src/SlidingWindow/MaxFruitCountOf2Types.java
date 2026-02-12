package SlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class MaxFruitCountOf2Types {

    public static void maxFruitCount(){
        char[] chr={'A', 'B', 'C', 'B', 'B', 'C'};
        int K=2;

        int windowStart = 0;
        int maxLength = 0;

        Map<Character,Integer> frequencyMap = new HashMap();
        for(int windowEnd = 0; windowEnd < chr.length; windowEnd++){
            frequencyMap.put(chr[windowEnd],frequencyMap.getOrDefault(chr[windowEnd] ,0) + 1);

            while (frequencyMap.size() > K){
                frequencyMap.put(chr[windowStart],frequencyMap.get(chr[windowStart]) - 1);

                if(frequencyMap.get(chr[windowStart]) == 0){
                    frequencyMap.remove(chr[windowStart]);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength,windowEnd - windowStart + 1);
        }

        System.out.println("Longest subchring length is "+maxLength);
    }

    public static void main(String[] args) {
        maxFruitCount();
    }
}
