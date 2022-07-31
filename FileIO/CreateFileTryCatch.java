package FileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFileTryCatch {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\Shuvo\\Downloads\\javaTest.txt";
        try {
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
            writer.write("lorem ipsum dolor sit amet, consectetur adipiscing elit. "
                    + "Donec eget nisl eu lectus tincidunt tincidunt. "
                    + "et consectetur nisl nunc eu lectus. ");
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
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage()); // Print the compiler error message
            System.out.println("There was an error creating the file"); // Print the self defined error message
        }
    }
}
