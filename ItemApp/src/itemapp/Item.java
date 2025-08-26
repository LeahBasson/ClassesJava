
package itemapp;


public class Item {
    // attributes
    private String code;
    private String name;
    private double price;
    private int qtyOnHand;
    
    // constructor
    public Item(){
    }
    
    public Item(String code, String name, double price, int qtyOnHand){
        this.code = code;
        this.name = name;
        this.price = price;
        this.qtyOnHand = qtyOnHand;
    }
    
    // getters and setter method
    public void setCode(String code){
        this.code = code;
    }
    
    public String code(){
        return this.code;
    }
    
    public String name(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double price(){
        return this.price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void qtyOnHand(int qtyOnHand){
        this.qtyOnHand = qtyOnHand;
    }
    
    public int qtyOnHand(){
        return this.qtyOnHand;
    }
    
    // decrQtyOnHand() method
    public void decrQtyOnHand(){
        
    }
    
    @Override
    public String toString(){
        return "\nCode: " + code + "\nName: " + name + "\nPrice: " + price + "\nQty On Hand: " + qtyOnHand;
    }
    
} // end of class
