
package onlineshop;


public class Product {
    
    Customer cus;
    String pro_name;
    String pro_price;

    public Product(String pro_name, String pro_price) {
        this.pro_name = pro_name;
        this.pro_price = pro_price;
    }
    
    
    public void getProduct()
    {
        cus.viewProduct();
    }
    
    
}
