import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
    public class Split{
        @SuppressWarnings("resource")
        public static void main(String args[]) throws FileNotFoundException{

            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter the account name:");
            String word = sc1.next();
            boolean flag = false;
            //  int count = 0;
            //   String user= "twittwe";
            //   String pass ="Hi@123";
            String[] words = null;
     /*   String line ="";
        Scanner sc2 = new Scanner(new FileInputStream("username.txt"));
        while(sc2.hasNextLine()) {
            line = sc2.nextLine();
            System.out.println(line);*/


            Scanner input = new Scanner(new FileInputStream("username.txt"));

            File file = new File("username.txt");

            input = new Scanner(file);
            while (input.hasNextLine()) {
                String line = input.nextLine();
                if(line.indexOf(word)!=-1) {
                    //    System.out.println("index id"+ line.indexOf(word));
                    words=line.trim().split("\\s+");
                    flag = true;
                    break;
                }
            }

            // String[] words=line.trim().split("\\s+");



            //          if(line.indexOf(word)!=-1) {
            //             System.out.println("index id"+ line.indexOf(word));
            //             flag = true;
            //          count = count+1;

            //System.out.println("index id"+ line.indexOf(word));

 /*   for(String w:words){
        System.out.println(w);}*/
            input.close();

            // System.out.println("index id"+ line.indexOf(word));
            if(flag) {
                System.out.println("Account found!");
                System.out.println(word);
                //          String[] words=word.trim().split("\\s+");
                //System.out.println("Account  is :"+words[0]);
                //         for(String w:words){
                //       System.out.println(w);
                System.out.println("username is :"+words[1]);
                System.out.println("Password is is :"+words[2]);  }}}
    //     }
    // System.out.println("Account not found!!");
    //Scanner SplitSc = new Scanner(new FileInputStream("username.txt"));
    //String s1="Twitter nirag hi@123";
    //   String[] words=word.split("\\s");

    //System.out.println("Account  is :"+words[0]);
    //   System.out.println("username is :"+words[1]);
    //   System.out.println("Password is is :"+words[2]);


    //   String s1="java string split method by javatpoint";
    //   String[] words=s1.split("\\s");
    //    for(String w:words){
    //       System.out.println(w);
    //    }
    // }}
