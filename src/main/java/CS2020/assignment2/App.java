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
        productId = new JTextField("Product Id");
        this.add(productId);
        this.getContentPane().add(yellowLabel, BorderLayout.CENTER);

        this.setVisible(true);     //Make frame visible

        
         

        
    }

    public class ProductListGUI{
        
    }


    
    public static void main( String[] args )
    {
        new App();

    }
        
        
}
