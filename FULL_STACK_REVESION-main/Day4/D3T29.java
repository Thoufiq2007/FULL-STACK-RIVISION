package Day4;

import java.util.*;

public class D3T29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a paragraph:");
        String paragraph = "";
        while (true) {
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            paragraph += line + " ";
        }    
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll("[^a-zA-Z\\s]", "");
        String[] words = paragraph.split("\\s+");
        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word,
                        wordCount.getOrDefault(word, 0) + 1);
            }
        }
        System.out.println("\nWord Frequencies:");
        String mostFrequentWord = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }
        System.out.println("\nMost Frequent Word: "
                + mostFrequentWord + " (" + maxCount + " times)");
        System.out.println("Unique Words: " + wordCount.size());
        sc.close();
    }
}
