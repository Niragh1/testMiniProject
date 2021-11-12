import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener {
    private JButton button1;
   private JPanel panel1;
    private JTextField textField1;
    private JPasswordField passwordField1;


    public static void main(String[] args) {


       JFrame f=new JFrame();//creating instance of JFrame



        JLabel login = new JLabel();
        login.setText("LOGIN");
        login.setBounds(50,10,100,20);


        JLabel label1 = new JLabel();
        label1.setText("Username");
        label1.setBounds(50,50,100,20);

        JTextField name = new JTextField();
        name.setBounds(50,70,250,30);

        JLabel label2 = new JLabel();
        label2.setText("Password");
        label2.setBounds(50,100,250,20);

        JPasswordField pass = new JPasswordField();
        pass.setBounds(50,120,250,30);

        JButton b=new JButton("SUBMIT");




        //adding button in JFrame


        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible

        //creating instance of JButton
        b.setBounds(130,200,100, 40);//x axis, y axis, width, height
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = name.getText();
                String password = pass.getName();
                System.out.println(username);

            }
        });

        f.add(login);
        f.add(label1);
        f.add(label2);
        f.add(name);
        f.add(pass);
        f.add(b);



    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }
}











