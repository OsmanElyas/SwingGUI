package CS2020.assignment2;
import java.awt.Color;


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

    JTextField productId;

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
        mainPanel.setBackground(Color.red);
        mainPanel.setBounds(0,0,550, 450);

        rightPanel = new JPanel();
        rightPanel.setBackground(Color.green);
        rightPanel.setBounds(550,0,250, 450);

        bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.blue);
        bottomPanel.setBounds(50,100,800, 100);

        this.add(mainPanel);
        this.add(rightPanel);
        this.add(bottomPanel);


        this.setVisible(true);     //Make frame visible

    }

    public class ProductListGUI{
        
    }


    
    public static void main( String[] args )
    {
        new App();

    }
        
        
}
