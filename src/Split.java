import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Split{
    public static void main(String args[]) throws FileNotFoundException{

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the account name:");
        String word = sc1.next();
        boolean flag = false;
        int count = 0;
        String user= "twittwe";
        String pass ="Hi@123";
        String line ="";


        Scanner sc2 = new Scanner(new FileInputStream("username.txt"));
        while(sc2.hasNextLine()) {
            line = sc2.nextLine();
            //System.out.println(line);
            if(line.indexOf(word)!=-1) {
                //System.out.println("index id"+ line.indexOf(word));
                flag = true;
                count = count+1;
            }
            //System.out.println("index id"+ line.indexOf(word));
        }
        System.out.println("index id"+ line.indexOf(word));
        if(flag) {
            System.out.println("Account found!");
            //System.out.println("Uername :" + user + "\npassword:" +pass);
            String[] words=word.split("\\s");
            //System.out.println("Account  is :"+words[0]);
            System.out.println("username is :"+words[0]);
            System.out.println("Password is is :"+words[2]);
        }else {
            System.out.println("Account not found!!");
        }//Scanner SplitSc = new Scanner(new FileInputStream("username.txt"));
        //String s1="Twitter nirag hi@123";
        String[] words=word.split("\\s");

        //System.out.println("Account  is :"+words[0]);
        System.out.println("username is :"+words[1]);
        System.out.println("Password is is :"+words[2]);


        /*String s1="java string split method by javatpoint";
        String[] words=s1.split("\\s");
        for(String w:words){
            System.out.println(w);*/
        }
    }