package input_output;

import java.io.*;

public class InputOutputMain {
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
        File file = new File("text.txt");
        try(InputStream inputStream = new FileInputStream(file)) {
            int count = inputStream.read();
            StringBuilder stringBuilder = new StringBuilder();
            while (count != 1) {
                stringBuilder.append((char) count);
                count = inputStream.read();
            }
            System.out.println(stringBuilder.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        long after = System.currentTimeMillis();
        System.out.println(after - before);
        int a = 0;

    }
}
