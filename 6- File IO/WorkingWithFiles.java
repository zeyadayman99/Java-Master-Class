package DiffExamples;

import java.io.*;
import java.util.Scanner;

public class WorkingWithFiles {
    public static void main(String[] args) {
        File file = createAFile("src/file.txt");
        writeToAFile(file, "Hello World", true);
        readFromAFile(file);
    }

    public static File createAFile(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IllegalStateException();
        }
    }

    public static void writeToAFile(File file, String text, boolean append) {
        try (
                FileWriter fileWriter = new FileWriter(file, append);
                PrintWriter printWriter = new PrintWriter(fileWriter);
                ){
            printWriter.println(text);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void readFromAFile(File file) {
        try (Scanner scanner = new Scanner(file);){
            while(scanner.hasNext()) {
                System.out.println(scanner.next());
            }
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}