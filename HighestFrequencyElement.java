import java.util.HashMap;
import java.util.Map;

public class HighestFrequencyElement {
    public static int findHighestFrequencyElement(int[] arr) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int maxElement = -1;
        boolean isUnique = true;

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();

            if (value > maxFreq) {
                maxFreq = value;
                maxElement = key;
                isUnique = true; 
            } else if (value == maxFreq) {
                isUnique = false; 
            }
        }
       return isUnique ? maxElement : -1;
    }

    public static void main(String[] args) {
        int arr[] = {30, 100, 20, 110, 200, 40, 50};
        System.out.println("Highest Frequency Element: " + findHighestFrequencyElement(arr));
    }
}
