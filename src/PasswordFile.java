import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errorspublic class TextfileGeneration {


    public class PasswordFile {
        PasswordFile() {
            try {
                File myObj = new File("password.txt");
                if (myObj.createNewFile()) {
                    System.out.println("File created: " + myObj.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        }
    }

