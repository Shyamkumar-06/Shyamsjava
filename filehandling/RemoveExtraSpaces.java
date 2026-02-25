import java.io.*;

public class RemoveExtraSpaces {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        FileWriter fw = new FileWriter("output.txt");

        String line;
        while ((line = br.readLine()) != null) {
            line = line.replaceAll("\\s+", " ");
            fw.write(line + "\n");
        }

        br.close();
        fw.close();
        System.out.println("Extra spaces removed.");
    }
}