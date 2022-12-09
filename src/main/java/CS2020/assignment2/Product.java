package CS2020.assignment2;

public class Product {
    private String productId;
    private String name;
    private Object type; 
    private String quantity;
    private boolean delivery;
    

    //setter and getter methods for the 4 main variables
    public Product(String productId, String name, Object type, String quantity, boolean delivery){
        this.productId = productId;
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.delivery = delivery;
    }

    public String getProductId(){
        return productId;
    }
    public void setProductId(String productId){
        this.productId = productId;
    }
    public Object get_Type(){
       return type;
    }
    public void setType(Object type) {
        this.type = type;
      }
    
    public String getQuantity(){
        return quantity;
    }
    public void setQuantity(String quantity){
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public boolean getDelivery(){
        return delivery;
    }

}
