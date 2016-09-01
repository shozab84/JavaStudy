package AddressBook;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by student on 24-Aug-16.
 */
public class AddressBookWelcomeWindow extends JFrame {
    private JPanel contentPane;
    private JButton btnEnter;
    private JLabel lblWelcome;


    public AddressBookWelcomeWindow(){
        setTitle("Welcome Frame");
        setSize(800,400);// 800 width, height 400
        setResizable(false);// so user can't resize the frame

        //center the frame
        //setLocationRelativeTo(null);
        Dimension di = getToolkit().getScreenSize();
        setLocation(di.width/2 - getWidth()/2, di.height/2 - getHeight()/2 );

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5,5,5,5));  // 5 5 5 5 are like margins
        setContentPane(contentPane);// adding content to the content pane
        contentPane.setLayout(null);

        btnEnter = new JButton("Enter") ;
        btnEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                AddressBookWelcomeWindow mainFrame = new AddressBookWelcomeWindow();
                //load Mainframe
            }
        });

        btnEnter.setBounds(360,200,70,25);

        contentPane.add(btnEnter);


        lblWelcome = new JLabel("Welcome to Employee Programme");
        lblWelcome.setForeground(Color.BLUE);
        lblWelcome.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20));
        lblWelcome.setBounds(220,80,400,100);
        contentPane.add(lblWelcome);

        setVisible(true);




    }




}
