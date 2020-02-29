
package onlineshop;

// creating customer class 

import java.util.ArrayList;


public class Customer {
    
    private String cu_name;
    private String cu_id;
    private String cu_pass;
    private String cu_phone;
    ArrayList<Order> order;
    
    Customer()
    {
        // default constructor
    }

    // getter setter for all field 

    public ArrayList<Order> getOrder() {
        return order;
    }

    public void setOrder(ArrayList<Order> order) {
        this.order = order;
    }


    
    
    public String getCu_name() {
        return cu_name;
    }

    public void setCu_name(String cu_name) {
        this.cu_name = cu_name;
    }

    public String getCu_id() {
        return cu_id;
    }

    public void setCu_id(String cu_id) {
        this.cu_id = cu_id;
    }

    public String getCu_pass() {
        return cu_pass;
    }

    public void setCu_pass(String cu_pass) {
        this.cu_pass = cu_pass;
    }

    public String getCu_phone() {
        return cu_phone;
    }

    public void setCu_phone(String cu_phone) {
        this.cu_phone = cu_phone;
    }
    
    // view product for customer 
    // initially we have no product to  show up
    
    public void  viewProduct()
    {
        System.out.println("no product");
    }
    
    
    public void oeder()
    {
        System.out.println("no order");
    }
    
    public void payment()
    {
        System.out.println("no payment");
    }
    
    
    
    
}
