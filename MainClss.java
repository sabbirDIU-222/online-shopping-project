
package onlineshop;

import java.util.ArrayList;
import java.util.Iterator;


public class MainClss {
    public static void main(String[] args) {
        
        Order ordr1 = new Order(112,true,"23 march");
        Order ordr2 = new Order(333,false,"23 march");
        Order ordr3 = new Order(114,true,"30 janurary");
        
        
        ArrayList<Order> order = new ArrayList<>();
        order.add(ordr1);
        order.add(ordr2);
        order.add(ordr3);
        
        Customer cus = new Customer();
        cus.setOrder(order);
        cus.payment();
        

        cus.setCu_name("sabbir");
        System.out.println(cus.getCu_name());
       
       
        
        Iterator itr = order.iterator();
        while(itr.hasNext())
        {
            
            Order ordr = (Order) itr.next();
            System.out.println(ordr.getO_id() + " " + ordr.getO_date()); 
            
            
           
        }
        
        
        
        
        
    }
    
}
