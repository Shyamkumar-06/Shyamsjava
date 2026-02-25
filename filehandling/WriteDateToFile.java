import java.io.FileWriter;
import java.time.LocalDate;

public class WriteDateToFile {
    public static void main(String[] args) throws Exception {
        FileWriter fw = new FileWriter("date.txt");

        LocalDate date = LocalDate.now();
        fw.write("Today's Date: " + date);

        fw.close();
        System.out.println("Date written to file.");
    }
}