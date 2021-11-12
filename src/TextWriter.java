import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextWriter {
    void runner(String[] ans) {

        String dataUser="";
        String dataPass="";
        String dataAcc="";
        String split=" ";
        String nl="\n";
        int i=1;

        try {
            Scanner userScn = new Scanner(System.in);
            Scanner passwordScn = new Scanner(System.in);
            while(i==1){
              dataUser=ans[0];
                System.out.println("Account name");
                dataAcc = ans[2];
               System.out.println("Enter the username");

               System.out.println(dataUser);


               //dataUser = userScn.next();
              System.out.println("Enter the password");
              String user=ans[1];
               //String user = passwordScn.next().trim();

                System.out.println(user);
                char[] sh=user.toCharArray();
                for(int i1=0;i1<sh.length;i1++)
                {sh[i1]= sh[i1]+=5;}

                String string = new String(sh);
                dataPass = string;

                i++;
            }
            /*Scanner userScn = new Scanner(System.in);
            System.out.println("Enter the username");

            String data = userScn.next();*/
            File f1 = new File("username.txt");
            if(!f1.exists()) {
                f1.createNewFile();
            }

            FileWriter fileWritter = new FileWriter(f1.getName(),true);
            BufferedWriter bw = new BufferedWriter(fileWritter);

            bw.write(dataAcc);
            bw.write(split);
            bw.write(dataUser);
            bw.write(split);
            bw.write(dataPass);
            bw.write(nl);

            bw.close();
            System.out.println("Done");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}