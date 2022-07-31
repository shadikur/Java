package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\Shuvo\\Downloads\\javaTest.txt";
        // Create a file object
        File file = new File(fileName);
        // Create the file
        file.createNewFile();
        // Check if the file exists
        if (file.exists()) {
            System.out.println("File created successfully or already exists");
        } else {
            System.out.println("Failed to create the file");
        }
        //Write to the file
        FileWriter writer = new FileWriter(file);
        writer.write("This is Shuvo - Just wrote this text in above file");
        writer.close();
        System.out.println("File written successfully");

        //Read the file
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
        bufferedReader.close();
        reader.close();
        
    }
}
