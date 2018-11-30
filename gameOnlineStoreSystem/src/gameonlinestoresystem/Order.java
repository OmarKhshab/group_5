/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gameonlinestoresystem;

/**
 *
 * @author Dell
 */
public class Order implements Subject{
    public final String OrderID;
    public String OrderStatus;

    public Order(String OrderID, String OrderStatus) {
        this.OrderID = OrderID;
        this.OrderStatus = OrderStatus;
    }

    public String getOrderID() {
        return OrderID;
    }
    
    public String getOrderStatus() {
        return OrderStatus;
    }

    public void trackOrder(String OrderID)
    {
        
    }
    public void UpdateStatus(String Status)
    {
        
    }
    
    @Override
    public void addObserver(Observer o )
    {
        
    }
    
    @Override
    public void removeObserver(Observer o )
    {
        
    }

    @Override
    public void notifyObserver( )
    {
        
    }

}
