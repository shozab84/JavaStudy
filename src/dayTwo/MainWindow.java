package dayTwo;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;
import static dayTwo.generatedPeople.people;

/**
 * Created by student on 24-Aug-16.
 */
public class MainWindow implements ActionListener {

    private JLabel lblFirstname;
    private JLabel lblLastName;
    private JLabel lblWeight;
    private JLabel lblHeight;
    private JLabel lblBirthDate;
    private JLabel lblSex;
    private JLabel lblPosition;
    private JLabel lblHireDate;
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JTextField txtWeight;
    private JTextField txtHeight;
    private JTextField txtBirthDate;
    private JTextField txtSex;
    private JTextField txtPosition;
    private JTextField txtHireDate;


    private JButton btnUpdate;
    private JButton btnRemove;


    // menu items

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenuItem newMenuItem, exitMenuItem, indexMenuItem;

    private JPanel content;
    private JPanel listPanel;// left hand side inner pannel
    private JPanel fieldPanel; // right hand side inner panel

    private JList employeeList;

    private JPanel inputPanel;
    private JPanel btnPanel;

    // calling constructor
    public MainWindow() {

        JFrame mainFrame = new JFrame("Employee Database");

        // setting window size

        mainFrame.setSize(800, 400);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);// interface is used here

        // creating new windows adapter

        WindowListener l = new WindowAdapter() {

            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog(mainFrame,
                        "Are you sure? Exit?",
                        "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null, null, null);

                if (confirm == 0) {
                    mainFrame.dispose();
                    System.exit(0);
                }

            }

        };

        // this make sure that the pop-up window pops in the same place
        Dimension di = mainFrame.getToolkit().getScreenSize();
        mainFrame.setLocation(di.width / 2 - mainFrame.getWidth() / 2, di.height / 2 - mainFrame.getHeight() / 2);

        mainFrame.addWindowListener(l);

        //call methods
        mainFrame.setJMenuBar(createMenu());

        content = (JPanel) mainFrame.getContentPane();
        // setting grid layout
        content.setLayout(new GridLayout(1, 2, 5, 5));// 1 row, 2 columns


        listPanel = new JPanel();// constructor
        listPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));

        //adding scroll pane
        JScrollPane scrollPane = new JScrollPane(createEmployeeList());

        // set size of the border

        scrollPane.setPreferredSize(new Dimension(380, 335));
        listPanel.add(scrollPane);
        content.add(listPanel);


        fieldPanel = new JPanel();
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Employee's Details");
        fieldPanel.setBorder(title);
        fieldPanel.add(createFieldPanel(), BorderLayout.CENTER);
        fieldPanel.add(createButtonPanel(), BorderLayout.SOUTH);
        fieldPanel.setVisible(false);

        content.add(fieldPanel);


        mainFrame.setVisible(true);// setting mainFrame to visible to the user


    }


    //creating Menu(file edit etc) method
    private JMenuBar createMenu() {

        menuBar = new JMenuBar();

        // file menu

        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);// keyboard shortcut to open File menu
        newMenuItem = new JMenuItem("New");
        newMenuItem.setMnemonic(KeyEvent.VK_N);
        newMenuItem.addActionListener(this);
        fileMenu.add(newMenuItem);


        exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.setMnemonic(KeyEvent.VK_E);
        exitMenuItem.addActionListener(this);
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);


        editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_D);// keyboard shortcut to open File menu
        indexMenuItem = new JMenuItem("Search");
        indexMenuItem.setMnemonic(KeyEvent.VK_S);
        indexMenuItem.addActionListener(this);
        editMenu.add(indexMenuItem);

        menuBar.add(editMenu);


        return menuBar;
    }


    private JList createEmployeeList() {
        employeeList = new JList(people.toArray());
        employeeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        return employeeList;
    }

    private JPanel createFieldPanel() {

        inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(0, 2, 5, 5));
        lblFirstname = new JLabel("First Name:");
        inputPanel.add(lblFirstname);
        txtFirstName = new JFormattedTextField();
        inputPanel.add(txtFirstName);


        // last name
        lblLastName = new JLabel("Last Name:");
        inputPanel.add(lblLastName);
        txtLastName = new JFormattedTextField();
        inputPanel.add(txtLastName);

        // weight
        lblWeight = new JLabel("Weight:");
        inputPanel.add(lblWeight);
        txtWeight = new JFormattedTextField();
        inputPanel.add(txtWeight);

        // height
        lblHeight = new JLabel("Height:");
        inputPanel.add(lblHeight);
        txtHeight = new JFormattedTextField();
        inputPanel.add(txtHeight);

        // Date of birth (YYYY/MM/DD

        lblBirthDate = new JLabel("Date of Birth (YYYY/MM/DD:");
        inputPanel.add(lblBirthDate);
        txtBirthDate = new JFormattedTextField();
        inputPanel.add(txtBirthDate);


        // Sex

        lblSex = new JLabel("SEX (M/F):");
        inputPanel.add(lblSex);
        txtSex = new JFormattedTextField();
        inputPanel.add(txtSex);


        // position

        lblPosition = new JLabel("Position:");
        inputPanel.add(lblPosition);
        txtPosition = new JFormattedTextField();
        inputPanel.add(txtPosition);

        //hired date


        lblHireDate = new JLabel("Hired Date (YYYY/MM/DD:");
        inputPanel.add(lblHireDate);
        txtHireDate = new JFormattedTextField();
        inputPanel.add(txtHireDate);


        return inputPanel;
    }


    private JPanel createButtonPanel() {
        btnPanel = new JPanel();
        btnPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));


        btnUpdate = new JButton("Update Boom");
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnPanel.add(btnUpdate); //calling button update


        btnRemove = new JButton("Remove not Boom");
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }

        });
        btnPanel.add(btnRemove);// calling button remove

        return btnPanel;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String action = e.getActionCommand();
        if ("New".equals(action))
            fieldPanel.setVisible(true);
        else if ("Exit".equals(action)){
            System.exit(0);
        }

    }

// getter and setter


    public JTextField getTxtFirstName() {
        return txtFirstName;
    }

    public JTextField getTxtLastName() {
        return txtLastName;
    }

    public JTextField getTxtWeight() {
        return txtWeight;
    }

    public JTextField getTxtHeight() {
        return txtHeight;
    }

    public JTextField getTxtBirthDate() {
        return txtBirthDate;
    }

    public JTextField getTxtSex() {
        return txtSex;
    }

    public JTextField getTxtPosition() {
        return txtPosition;
    }

    public JTextField getTxtHireDate() {
        return txtHireDate;
    }

    public
}
