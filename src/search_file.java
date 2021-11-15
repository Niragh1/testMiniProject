import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class search_file extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    boolean flag = false;
    search_file(){
        JFrame f = new JFrame();
        f.setTitle("Search");
        f.setVisible(true);
        f.setSize(400, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLayout(null);

        JTextField name = new JTextField();
        JTextField foundname = new JTextField();
        foundname.setVisible(false);
        JTextField foundpassword = new JTextField();
        foundpassword.setVisible(false);
        JLabel label1 = new JLabel();
        label1.setText("Enter account name");
        JLabel label2 = new JLabel();
        label2.setText("SEARCH RESULTS");
        label2.setFont(label2.getFont().deriveFont(20f));

        label2.setVisible(false);
        JButton s = new JButton("Search");
        JButton b = new JButton("Back");
        JLabel label3 = new JLabel();
        label3.setText("name");
        label3.setVisible(false);
        JLabel label4 = new JLabel();
        label4.setText("password");
        label4.setVisible(false);


        f.add(name);
        f.add(label1);
        f.add(label2);
        f.add(label3);
        f.add(label4);
        f.add(foundname);
        f.add(foundpassword);
        f.add(s);
        f.add(b);

        label1.setBounds(100, 40, 150, 30);
        name.setBounds(100, 70, 150, 30);
        s.setBounds(100, 140, 100, 30);
        b.setBounds(200, 140, 100, 30);
        label2.setBounds(70, 210, 250, 30);
        label3.setBounds(70, 280, 100, 30);
        foundname.setBounds(150, 280, 150, 30);
        label4.setBounds(70, 350, 100, 30);
        foundpassword.setBounds(150, 350, 150, 30);

        s.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == s) {
                    String result1 = null;


                    try {


                        //      Scanner sc1 = new Scanner(System.in);
                        //      System.out.println("Enter the account name:");

                        String word = name.getText();


                        //  int times = 0;
                        String[] words = null;

                        Scanner input = new Scanner(new FileInputStream("username.txt"));
                        File file = new File("username.txt");
                        input = new Scanner(file);
                        while (input.hasNextLine()) {
                            String line = input.nextLine();
                            if (line.contains(word)) {
                                words = line.trim().split("\\s+");
                                flag = true;
                                label2.setVisible(true);
                                label3.setVisible(true);
                                label4.setVisible(true);
                                foundname.setVisible(true);
                                foundpassword.setVisible(true);
                                JOptionPane.showMessageDialog(null, "Account Found");
                                System.out.println("username is :" + words[1]);
                                foundname.setText(words[1]);
                                String oPass = words[2];
                                char[] sh = oPass.toCharArray();
                                for (int i1 = 0; i1 < sh.length; i1++) {
                                    sh[i1] = sh[i1] -= 5;
                                }

                                String string = new String(sh);
                                oPass = string;
                                foundpassword.setText(oPass);


                            }

                        }


                        input.close();


                        //  System.out.println("Account Doesn't Exist");


                    } catch (FileNotFoundException q) {
                        q.printStackTrace();
                    }
                }




                if(flag!=true)
                    JOptionPane.showMessageDialog(null, "Account Not Found");

            }
        });
b.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {

            menu_file menu = new menu_file();
            f.dispose();
            menu.setVisible(true);

    }
});

    }}


