package CS2020.assignment2;
import javax.swing.*;


/**
 * Hello world!
 *
 */
public class App extends JFrame {
    JTextField productId;
    JPanel mainPane;

    App(){

        this.setTitle("<Osman Elyas> : Assignment 2");
        this.setSize(800,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu actionsMenu = new JMenu("Actions");

        JMenuItem about = new JMenuItem("About");
        JMenuItem importData = new JMenuItem("Import Data");
        JMenuItem inventory = new JMenuItem("Inventory");
        JMenuItem export = new JMenuItem("Export to CSV");

        actionsMenu.add(about);
        actionsMenu.add(importData);
        actionsMenu.add(inventory);
        actionsMenu.add(export);

        menuBar.add(actionsMenu);
        this.setJMenuBar(menuBar);
        

        this.setVisible(true);     //Make frame visible

        
         

        
    }

    public class ProductListGUI{
        
    }


    
    public static void main( String[] args )
    {
        new App();

    }
        
        
}
