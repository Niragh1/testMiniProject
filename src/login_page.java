import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class login_page extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");


    login_page() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();

    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);


    }

    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();

            Scanner scanner = null;
            try {
                scanner = new Scanner(new FileInputStream("password.txt"));
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
            String line;
            while (scanner.hasNextLine() && !isBlank(line = scanner.nextLine())) {

                String[] accountData = line.split(" ");
                String user = accountData[0];
                String password = accountData[1];
                System.out.println(user + ", " + password);






            if (userText.equalsIgnoreCase(user) && pwdText.equalsIgnoreCase(password)) {
                JOptionPane.showMessageDialog(this, "Login Successful");
                menu_file menu = new menu_file();
                dispose();
                menu.setVisible(true);



            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }}

        }
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
          /*  GUI a = new GUI();
            setVisible(false);
            a.setVisible(true);*/

        }
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }


        }
    }

    private boolean isBlank(String s) {
        return s == null || s.isEmpty();
    }

}
class Login {
    public static void main(String[] a) {
        login_page frame = new login_page();
        UserNameFile file =new UserNameFile();
        PasswordFile p = new PasswordFile();
        file.filemaker();
        frame.setTitle("Login Form");
        frame.setVisible(true);
        frame.setBounds(10, 10, 370, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);

    }

}