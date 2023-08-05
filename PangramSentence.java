package CrashCourse;

import java.util.HashSet;
import java.util.Set;

public class PangramSentence {

    public boolean checkIfPangram(String sentence) {
        Set<Character> set = Set.of('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

        Set<Character> sentenceSet = new HashSet<>();

        for (Character c : sentence.toCharArray()) {
            sentenceSet.add(c);
        }

        return sentenceSet.equals(set);
    }


    public static void main(String[] args) {
        PangramSentence p = new PangramSentence();
        String sentence1 = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(p.checkIfPangram(sentence1));
        String sentence2 = "leetcode";
        System.out.println(p.checkIfPangram(sentence2));
    }
}
