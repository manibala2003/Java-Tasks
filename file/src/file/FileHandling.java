package file;
import java.io.*;
import java.util.*;

public class FileHandling {
    public static void main(String args[]) {
        File inputFile = new File("ex.txt");
        File outputFile = new File("tx.txt");
        
        try {
        	Scanner sc = new Scanner(inputFile);
             FileWriter fw = new FileWriter(outputFile);
            
            while (sc.hasNextLine()) {
                String str = sc.nextLine();
                fw.write(str + System.lineSeparator());
            }
            
            System.out.println("Copied successfully!");
            fw.close();
            sc.close();
            
        } catch (IOException e) {
            System.out.println("An error occurred during file handling: " + e.getMessage());
        }
    }
}
