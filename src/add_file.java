import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class add_file extends JFrame implements ActionListener {
    private static String[] ans= new String[3];
    private JButton button1;
   private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JTextField textField2;
    static String username;
    static String password;

add_file(){



  //  public static void main(String[] args) {

    TextWriter txt = new TextWriter();




            JFrame f = new JFrame();
            f.setTitle("Add Password");
            f.setVisible(true);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setResizable(false);


            JLabel login = new JLabel();
            login.setText("Account name");
            login.setBounds(50, 20, 100, 20);

            JTextField acc = new JTextField();
            acc.setBounds(50, 50, 250, 30);


            JLabel label1 = new JLabel();
            label1.setText("Username");
            label1.setBounds(50, 80, 100, 20);

            JTextField name = new JTextField();
            name.setBounds(50, 100, 250, 30);

            JLabel label2 = new JLabel();
            label2.setText("Password");
            label2.setBounds(50, 130, 250, 20);

            JPasswordField pass = new JPasswordField();
            pass.setBounds(50, 150, 250, 30);

            JButton b = new JButton("SUBMIT");
            JButton back = new JButton("BACK");
            back.setBounds(230, 200, 100, 40);





            f.setSize(400, 500);
            f.setLayout(null);
            f.setVisible(true);


            b.setBounds(30, 200, 100, 40);
            b.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    username = name.getText();

                    ans[1]=new String(pass.getPassword());

                    ans[0]=username;
                    ans[2]=new String(acc.getText());

                    txt.runner(ans);
                    name.setText(null);
                    pass.setText(null);
                    acc.setText(null);
                    JOptionPane.showMessageDialog(null, "Account Added!");


                }
            });
            back.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    f.dispose();
                    menu_file menu =new menu_file();
                    menu.setVisible(true);
                }
            });


            f.add(login);
            f.add(label1);
            f.add(label2);
            f.add(name);
            f.add(pass);
            f.add(b);
            f.add(acc);
            f.add(back);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


}














