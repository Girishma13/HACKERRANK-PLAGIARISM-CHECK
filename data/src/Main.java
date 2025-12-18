import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("data/sample1.java");
            BufferedReader br = new BufferedReader(new FileReader(file));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (Exception e) {
            System.out.println("Error reading file");
        }
    }
}

