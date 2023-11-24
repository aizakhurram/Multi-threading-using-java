import java.util.*;
public class DataStructures{
    public static void main(String[] args) {
        // ArrayList Operations
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.remove(0);
        boolean existsInArrayList = arrayList.contains(5);
        int arrayListSize = arrayList.size();

        System.out.println("ArrayList Operations:");
        System.out.println("Exists in ArrayList: " + existsInArrayList);
        System.out.println("ArrayList Size: " + arrayListSize);
        for (int element : arrayList) {
            System.out.print(element+" ");
        }

        // HashMap Operations
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("apple", 10);
        hashMap.put("banana", 5);
        int valueFromHashMap = hashMap.get("apple");
        boolean keyExistsInHashMap = hashMap.containsKey("orange");

        System.out.println("\nHashMap Operations:");
        System.out.println("Value from HashMap: " + valueFromHashMap);
        System.out.println("Key Exists in HashMap: " + keyExistsInHashMap);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }

        // LinkedList Operations using java.util.LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addFirst(1); 
        linkedList.addLast(2); 
        linkedList.addLast(3);
        linkedList.remove(Integer.valueOf(2)); 
        boolean searchResult = linkedList.contains(3); 

        System.out.println("\nLinkedList Operations:");
        System.out.println("LinkedList: " + linkedList);
        System.out.println("Search Result: " + searchResult);

        // Stack Implementation using built-in Stack class
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        int poppedValue = stack.pop();
        boolean isStackEmpty = stack.isEmpty();

        System.out.println("\nStack Implementation:");
        System.out.println("Popped Value: " + poppedValue);
        System.out.println("Is Stack Empty: " + isStackEmpty);
          System.out.println("Stack Elements:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+ " ");
        }

        // Queue Implementation using built-in Queue class
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(30); 
        queue.offer(40);
        int dequeuedValue = queue.poll(); 
        boolean isQueueEmpty = queue.isEmpty();
        int queueSize = queue.size();

        System.out.println("\nQueue Implementation:");
        System.out.println("Dequeued Value: " + dequeuedValue);
        System.out.println("Is Queue Empty: " + isQueueEmpty);
        System.out.println("Queue Size: " + queueSize);

        System.out.println("\nQueue Elements:");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll()+ " ");
        }
      

        // Sorting ArrayList
        ArrayList<Integer> sortingArrayList = new ArrayList<>();
        sortingArrayList.add(5);
        sortingArrayList.add(2);
        sortingArrayList.add(9);
        sortingArrayList.add(1);
        System.out.println("\nUnSorted ArrayList:");
        for (int element : sortingArrayList) {
            System.out.print(element+", ");
        }
        Collections.sort(sortingArrayList);

        System.out.println("\nSorting ArrayList:");
        for (int element : sortingArrayList) {
            System.out.print(element+", ");
        }
    }
}
