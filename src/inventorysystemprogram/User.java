/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysystemprogram;

/**
 *
 * @author HP
 */
public class User {
    
    private String productid;
    private String productname;
    private String quantity;
    private String price;
    
    public User(String PID, String PName, String Quantity, String Price)
    {
        this.productid=PID;
        this.productname=PName;
        this.quantity=Quantity;
        this.price=Price;
    }
    
    public String getPID()
    {
        return productid;
    }
    public String getPName()
    {
        return productname;
    }
    public String getQuantity()
    {
        return quantity;
    }
    public String getPrice()
    {
        return price;
    }
    
}
