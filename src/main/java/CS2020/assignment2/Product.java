package CS2020.assignment2;
import java.util.UUID;
//import java.awt.event.*;
//import javax.swing.event.MouseEventListener;

public class Product extends ProductListGUI{
    private UUID productId;
    private String type; 
    private int quantity;
    private String name;

    //setter and getter methods for the 4 main variables
    public Product(){
        this.productId = UUID.randomUUID();
    }

    public UUID getProductId(){
        return productId;
    }
    public void setProductId(UUID productId){
        this.productId = productId;
    }
    public String get_Type(){
       return type;
    }
    public void setType(String type) {
        this.type = type;
      }
    
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }


}
