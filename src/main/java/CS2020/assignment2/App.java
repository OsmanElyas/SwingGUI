package CS2020.assignment2;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;


/**
 * Hello world!
 *
 */
public class App extends JFrame {
    


    public static void ProductListGUI(){

        JMenuBar menuBar;
        JMenu actionsMenu;
        JMenuItem about;
        JMenuItem importData;
        JMenuItem inventory;
        JMenuItem export;
        JPanel mainPanel;
        JPanel  rightPanel;
        JPanel bottomPanel;
    
        JButton newItem;
        JButton save;
        JButton delete;
        JScrollPane scroll;

        JFrame frame = new JFrame();
        // Create the main frame that will be used
        frame.setTitle("<Osman Elyas> : Assignment 2");
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

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
        frame.setJMenuBar(menuBar);
        

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
        JTextField product = new JTextField("8101ac25-fcf1-4c32-a3f1-2a946");
        
        JLabel label3 = new JLabel("Item Type");
        String[] items = { "Select type", "Homeware", "Hobby", "Garden" };
        JComboBox<String> itemList = new JComboBox<>(items);
        itemList.setSelectedIndex(0);

        JLabel label2 = new JLabel("Name");
        
        JTextField name = new JTextField(20); 
        

        JLabel label4 = new JLabel("Quantity");
        JTextField quantity = new JTextField(5);

        JCheckBox delivery = new JCheckBox("Available for next day delivery");

        //add labels to the panel
        mainPanel.add(label);
        mainPanel.add(product);
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

        product.setBounds(150, 50, 200, 25);
        name.setBounds(150, 90, 200, 25);
        itemList.setBounds(150, 130, 200, 25);
        quantity.setBounds(150,  170, 200, 25);
        delivery.setBounds(10,210,200,100);
        

        //Add ScrollBar
        rightPanel.setLayout(new GridLayout(1,0));
        final JTextArea textArea = new JTextArea();
        scroll = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
 
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
        frame.add(mainPanel,BorderLayout.CENTER);
        frame.add(rightPanel,BorderLayout.EAST);
        frame.add(bottomPanel,BorderLayout.SOUTH);

        


        frame.setVisible(true);     //Make frame visible

    }
    
    public static void main( String[] args ){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {;
        public void run(){
            ProductListGUI();
        }


        });
    }
        
        
}
