import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menu_file extends JFrame {
    private JButton button1;
    private JPanel panel1;
    private JButton button2;

    menu_file() {

        JFrame f = new JFrame();
        f.setTitle("MENU");
        f.setVisible(true);
        f.setSize(400, 500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setResizable(false);
        f.setLayout(null);

        JButton addButton = new JButton("ADD NEW ");
        JButton searchButton = new JButton("SEARCH");

        addButton.setBounds(150, 150, 100, 30);
        searchButton.setBounds(150, 220, 100, 30);

        f.add(addButton);
        f.add(searchButton);


        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add_file a = new add_file();
                // setVisible(false);
                f.dispose();
                a.setVisible(true);
            }
        });

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                search_file search = new search_file();
                f.dispose();
                search.setVisible(true);
            }
        });




    }
}