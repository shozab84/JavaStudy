package dayTwo;

import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import static dayTwo.generatedPeople.people;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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


    // creating menu items

    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenuItem newMenuItem, exitMenuItem, indexMenuItem;

    private JPanel content;
    private JPanel listPanel;// left hand side inner pannel
    private JPanel fieldPanel; // right hand side inner panel
    private JPanel inputPanel;
    private JPanel btnPanel;

    private JList employeeList;

    private JList createEmployeeList;

    private int employeeIndex;
    private boolean createNew;
    private int EmployeeIndex = -1;



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

        prepareJList();


        listPanel = new JPanel();// constructor
        listPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));

        //adding scroll pane
        JScrollPane scrollPane = new JScrollPane(createEmployeeList());

        // set size of the border

        scrollPane.setPreferredSize(new Dimension(380, 335));
        listPanel.add(scrollPane);
        listPanel.setVisible(false);
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


    }//end of MainWindow


    //creating Menu(file edit etc) method
        private JMenuBar createMenu() {

        menuBar = new JMenuBar();

        // file menu

        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);// keyboard shortcut to open File menu
        newMenuItem = new JMenuItem("New");
        newMenuItem.setMnemonic(KeyEvent.VK_N);
        newMenuItem.addActionListener(this);// this will invoke controller object
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


    private void prepareJList(){


        employeeList = new JList(people.toArray());
        employeeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        employeeList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                fieldPanel.setVisible(true);
                employeeIndex = employeeList.getSelectedIndex();
                if (people.size()>0 && employeeIndex != -1)
                    loadEmployeeFields(employeeIndex);
                else
                    clearTxtfields();

            }
        });

    }

    private JList createEmployeeList() {
        DefaultListModel listModel = new DefaultListModel();
        if (people.size() > 0) {
            for (Employee e : people)
                listModel.addElement(e);

        }
        employeeList.setModel(listModel);

        return employeeList;


    }// end of JList createEmployeeList



        private JPanel createFieldPanel(){


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

        lblBirthDate = new JLabel("Date of Birth (YYYY-MM-DD:");
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


        lblHireDate = new JLabel("Hired Date (YYYY-MM-DD:");
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
              public void actionPerformed(ActionEvent e) {// when user click update new methods are created

                if(createNew & employeeList.isSelectionEmpty()){

                    try {

                        TaskProcessing.createEmployee(getFieldsInfo());
                        createEmployeeList();
                        createNew = false;
                        clearTxtfields();
                    }

                    catch (SQLException createEx){
                        JOptionPane.showMessageDialog((null), "Error Adding Employee" +
                        System.lineSeparator() + createEx);


                    }


                }

                else {

                    TaskProcessing.editDetails(employeeIndex,getFieldsInfo());
                    createEmployeeList();
                }
                 createNew = false;
                 employeeIndex =-1;

        }});
        btnPanel.add(btnUpdate); //calling button update


        btnRemove = new JButton("Remove");
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    TaskProcessing.removeEmployee(employeeIndex);
                    clearTxtfields();
                    createEmployeeList();
                    employeeIndex =-1;
                }

            }
        );
        btnPanel.add(btnRemove);// calling button remove

        return btnPanel;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        String action = e.getActionCommand();
        if ("New".equals(action)) {
            clearTxtfields();

            if (employeeIndex <0)
                createNew = true;

            listPanel.setVisible(true);
            fieldPanel.setVisible(true);
        }
        else if ("Exit".equals(action)){
            System.exit(0);
        }
        else if ("Search".equals(action)){
            String fnSearch = JOptionPane.showInputDialog("Enter first Name");
            employeeIndex = TaskProcessing.searchByFirstName(fnSearch);
            if (employeeIndex != -1)
                loadEmployeeFields(employeeIndex);
            else
                JOptionPane.showMessageDialog(null, "Cannot find it");// tell user if search is not found.
        }
    }


    private void clearTxtfields(){
        txtFirstName.setText("");// makes firstname field blank.
        txtLastName.setText("");// makes firstname field blank.
        txtHeight.setText("");// makes firstname field blank.
        txtWeight.setText("");// makes firstname field blank.
        txtBirthDate.setText("");// makes firstname field blank.
        txtSex.setText("");// makes firstname field blank.
        txtPosition.setText("");// makes firstname field blank.
        txtHireDate.setText("");// makes firstname field blank.

    }// end of clearTxtfields method


    private void loadEmployeeFields(int index){


        txtFirstName.setText(people.get(index).getFirstName());// when user selects a record, his details populate in different txt boxes
        txtLastName.setText(people.get(index).getLastName());
        txtWeight.setText(Double.toString(people.get(index).getWeight()));
        txtHeight.setText(Short.toString(people.get(index).getHeight()));
        txtBirthDate.setText(people.get(index).getBirthDate().toString());
        txtSex.setText(people.get(index).getSex().toString());
        txtPosition.setText(people.get(index).getPosition());
        txtHireDate.setText(people.get(index).getHireDate().toString());

    }// end of loadEmployeeFields method



    private java.util.List<String> getFieldsInfo(){
        List<String> data = new ArrayList<>();

        data.add((txtFirstName.getText()));
        data.add((txtLastName.getText()));
        data.add((txtHeight.getText()));
        data.add((txtWeight.getText()));
        data.add((txtBirthDate.getText()));
        data.add((txtSex.getText()));
        data.add((txtPosition.getText()));
        data.add((txtHireDate.getText()));

        return data;

        // creating an array- stringDob
        //String[] stringDob = txtBirthDate.getText().split("-");
       // data.add(stringDob [0]);
       // data.add(stringDob [1]);
        //data.add(stringDob [2]);
       // data.add(txtSex.getText());
        //data.add(txtPosition.getText());

        //String[] stringHireDate = txtHireDate.getText().split("-");
        //data.add(stringHireDate[0]);
        //data.add(stringHireDate[1]);
       // data.add(stringHireDate[2]);

    }

}
