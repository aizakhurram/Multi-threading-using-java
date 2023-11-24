public class MultithreadCountTask {
    public static void main(String[] args) {
        String filename = "data.txt"; 
        int numThreads = 4; 

        WordCounter wordCounter = new WordCounter();
        Thread[] threads = new Thread[numThreads];

        try {

            for (int i = 0; i < numThreads; i++) {
                threads[i] = new Thread(new FileProcessor(filename, wordCounter));
                threads[i].start();
            }


            for (Thread thread : threads) {
                thread.join();
            }


            wordCounter.printWordCount();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}