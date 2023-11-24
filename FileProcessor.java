import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileProcessor implements Runnable {
    private String filename;
    private WordCounter wordCounter;

    public FileProcessor(String filename, WordCounter wordCounter) {
        this.filename = filename;
        this.wordCounter = wordCounter;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCounter.countWords(words);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
