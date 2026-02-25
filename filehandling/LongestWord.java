import java.io.*;
import java.util.StringTokenizer;

public class LongestWord {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));

        String line;
        String longestWord = "";

        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens()) {
                String word = st.nextToken();
                if (word.length() > longestWord.length()) {
                    longestWord = word;
                }
            }
        }

        br.close();
        System.out.println("Longest word: " + longestWord);
    }
}