package CS2020.assignment2;
import java.awt.*;
import javax.swing.*;


/**
 * Hello world!
 *
 */
public class App extends JFrame {
    
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

    App(){
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

        mainPanel.setBackground(Color.red);
        rightPanel.setBackground(Color.green);
        bottomPanel.setBackground(Color.blue);

        mainPanel.setPreferredSize(new Dimension(550, 450));
        rightPanel.setPreferredSize(new Dimension(250, 450));
        bottomPanel.setPreferredSize(new Dimension(800, 100));

        //Product details section in left hand side
        mainPanel.setLayout(new GridLayout());
        JLabel label = new JLabel("Product Id");
        JTextField product = new JTextField("8101ac25-fcf1-4c32-a3f1-2a946");
        JLabel label2 = new JLabel("Name");
        JTextField name = new JTextField(20);

        mainPanel.add(label);
        mainPanel.add(product);
        mainPanel.add(label2);
        mainPanel.add(name);

        
        /*mainPanel.add(new JTextField("Name",));
        mainPanel.add(new JTextField("Product ID"));
        mainPanel.add(new JTextField("Product ID"));
        mainPanel.add(new JTextField("Product ID"));*/

        //Add ScrollBar
        final JTextArea textArea = new JTextArea(26, 22);
        scroll = new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        rightPanel.add(scroll);
        

        //Add buttons to bottom of GUI
        newItem = new JButton();
        newItem.setText("New Item");
        save = new JButton();
        save.setText("Save");
        delete = new JButton();
        delete.setText("Delete Selected");
        
        bottomPanel.add(newItem);
        bottomPanel.add(save);
        bottomPanel.add(delete);

        this.add(mainPanel,BorderLayout.CENTER);
        this.add(rightPanel,BorderLayout.EAST);
        this.add(bottomPanel,BorderLayout.SOUTH);


        this.setVisible(true);     //Make frame visible

    }

    public class ProductListGUI{
        
    }


    
    public static void main( String[] args )
    {
        new App();

    }
        
        
}
