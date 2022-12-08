package CS2020.assignment2;

public class Product extends ProductListGUI{
    String productId;
    String type; 
    int quantity;
    String name;

    //setter and getter methods for the 4 main variables

    public String getProductId(){
        return productId;
    }
    //public String getType(){
       // return type;
   // }
    public int getQuantity(){
        return quantity;
    }
    public String getName(){
        return name;
    }
    public void setProductId(String productId){
        this.productId = productId;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    public void setName(String name){
        this.name = name;
    }
    
    public void setProductId(){

    }
}
