package FileIO;

import java.io.File;

public class deleteFile {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Shuvo\\Downloads\\javaTest.txt";
        File file = new File(fileName);
        if (file.exists()) {
            file.delete();
            System.out.println("File deleted successfully");
        } else {
            System.out.println("File does not exist");
        }
    }
}
