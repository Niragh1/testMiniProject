import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FindingWordFromFile {
    public static void main(String args[]) throws FileNotFoundException {
//Reading the word to be found from the user
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the account name:");
        String word = sc1.next();
        boolean flag = false;
        int count = 0;
        String user= "twittwe";
        String pass ="Hi@123";
        //System.out.println("Contents of the line");
//Reading the contents of the file
        Scanner sc2 = new Scanner(new FileInputStream("username.txt"));
        while(sc2.hasNextLine()) {
            String line = sc2.nextLine();
            //System.out.println(line);
            if(line.indexOf(word)!=-1) {
                flag = true;
                count = count+1;
            }
        }
        if(flag) {
            System.out.println("Account found!");
            System.out.println("Uername :" + user + "\npassword:" +pass);
        }else {
            System.out.println("Account not found!!");
        }
    }
}