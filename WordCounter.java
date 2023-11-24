
import java.util.HashMap;
import java.util.Map;

class WordCounter {
    private Map<String, Integer> wordCountMap = new HashMap<>();

    public synchronized void countWords(String[] words) {
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
    }

    public synchronized void printWordCount() {
        System.out.println("Word Count:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}


