package CS2020.assignment2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.util.UUID;


public class ProductListGUI extends JFrame implements ActionListener{
    JMenuBar menuBar;
    JMenu actionsMenu;
    JMenuItem about;
    JMenuItem importData;
    JMenuItem inventory;
    JMenuItem export;
    JPanel mainPanel;
    JPanel  rightPanel;
    JPanel bottomPanel;

    JTextField products;
    JTextField name;
    JTextField quantity;
    JComboBox<String> itemList;

    JButton newItem;
    JButton save;
    JButton delete;
    JScrollPane scroll;
    JList<String> productList;
    DefaultListModel<String> listmodel = new DefaultListModel<>();




// method that creates the elements of the GUI
    public ProductListGUI(){
        // Create the main frame that will be used
        this.setTitle("<Osman Elyas> : Assignment 2");
        this.setSize(800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        //implement the menu bar
        menuBar= new JMenuBar();

        actionsMenu = new JMenu("Actions");

        about = new JMenuItem("About");
        importData = new JMenuItem("Import Data");
        inventory = new JMenuItem("Inventory");
        export = new JMenuItem("Export to CSV");

        actionsMenu.add(about);
        actionsMenu.add(importData);
        actionsMenu.add(inventory);
        actionsMenu.add(export);

        menuBar.add(actionsMenu);
        this.setJMenuBar(menuBar);
        

        //seperate the frame into the needed panels
        mainPanel = new JPanel();
        rightPanel = new JPanel();
        bottomPanel = new JPanel();

        //create and add border title to main panel
        Border blackline = BorderFactory.createTitledBorder("Product Details");
        mainPanel.setBorder(blackline);


        //Create the panels to seperate the GUI into different sections
        mainPanel.setPreferredSize(new Dimension(550, 450));
        rightPanel.setPreferredSize(new Dimension(250, 450));
        bottomPanel.setPreferredSize(new Dimension(800, 100));


        //Define the Product details section in left hand side 
        JLabel label = new JLabel("Product Id");
        products = new JTextField();

        // Set the ProductID text field to be automatically populated with a unique identifier
        products.setText(UUID.randomUUID().toString());
        
        JLabel label3 = new JLabel("Item Type");
        String[] items = { "Select type", "Homeware", "Hobby", "Garden" };
        itemList = new JComboBox<>(items);
        itemList.setSelectedIndex(0);

        JLabel label2 = new JLabel("Name");
        
        name = new JTextField(20); 
        

        JLabel label4 = new JLabel("Quantity");
        quantity = new JTextField(5);

        JCheckBox delivery = new JCheckBox("Available for next day delivery");

        //add labels to the panel
        mainPanel.add(label);
        mainPanel.add(products);
        mainPanel.add(label2);
        
        mainPanel.add(name);
        mainPanel.add(label3);
        mainPanel.add(itemList);
        mainPanel.add(label4);
        mainPanel.add(quantity);
        mainPanel.add(delivery);

        
        //setting locations and sizes of the fields
        mainPanel.setLayout(null);
        label.setBounds(10, 10, 200, 100);
        label2.setBounds(10, 50, 200, 100);
        label3.setBounds(10, 90, 200, 100);
        label4.setBounds(10,  130, 200, 100);

        products.setBounds(150, 50, 230, 25);
        name.setBounds(150, 90, 200, 25);
        itemList.setBounds(150, 130, 200, 25);
        quantity.setBounds(150,  170, 200, 25);
        delivery.setBounds(10,210,200,100);
        

        //Add ScrollBar with a JList
        productList = new JList<String>();
        rightPanel.setLayout(new GridLayout());

        scroll = new JScrollPane(productList,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        rightPanel.add(scroll);
        

        //Add buttons to bottom of GUI
        newItem = new JButton();
        newItem.setText("New Item");

        
        save = new JButton();        
        save.setText("Save");
        

        delete = new JButton();
        delete.setText("Delete Selected");
        delete.setEnabled(false);

        //set locations of buttons
        newItem.setBounds(130,10,100,20);
        save.setBounds(240,10,70,20);
        delete.setBounds(580,10,150,20);

        bottomPanel.setLayout(null);
        bottomPanel.add(newItem);
        bottomPanel.add(save);
        bottomPanel.add(delete);

        
        //add the panels to the main frame
        this.add(mainPanel,BorderLayout.CENTER);
        this.add(rightPanel,BorderLayout.EAST);
        this.add(bottomPanel,BorderLayout.SOUTH);

        save.addActionListener(this);       //add action listener for save button

         //action listener for new item button
        //@Override
            newItem.addActionListener(new ActionListener() {;
            public void actionPerformed(ActionEvent e) {
            //Action Listener
            products.setText(UUID.randomUUID().toString());
            name.setText("");
            quantity.setText("0");
            itemList.setSelectedIndex(0);
            delivery.setSelected(false);

/*             String theName = name.getText();
            String theQuantity = quantity.getText();
            DefaultListModel<String> listmodel = new DefaultListModel<String>();
            listmodel.addElement(theName + "("+ theQuantity + ")");
            productList.setModel(listmodel);
           
            System.out.println("Hello");
            System.out.println(listmodel); */
            
        };
    });  
        this.setVisible(true);     //Make frame visible
        

    }


// action listener adds the eproduct to the jlist and displays it when save button is clicked
     @Override
    public void actionPerformed(ActionEvent e) {
        //Validation checks to make sure input is correct

        //if no namae is entered
        if (name.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"Please enter a name for the product" );
            
          }
          //if no type is selected
        else if (itemList.getSelectedItem().equals("Select type")) {
            JOptionPane.showMessageDialog(null,"Please select a type for the product" );
           
          }else{
          //if negative number is chosen

        try{      
            final String text = quantity.getText();
            int qty = Integer.parseInt(text);
            if (qty < 0 || text.isEmpty() == true) {
                JOptionPane.showMessageDialog(null,"Please enter a non-negative integer for the quantity");
                
            } 
        }   catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null,"Please enter a a valid integer for quantity");
                
              }
        }


 
         System.out.println("Button Clicked");
            String theName = name.getText();
            String theQuantity = quantity.getText();
            
            final String element = theName + "("+ theQuantity + ")";
            listmodel.addElement(element);
            productList.setModel(listmodel);
            System.out.println(listmodel);
                    
    } 



}



