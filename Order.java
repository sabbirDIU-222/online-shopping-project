
package onlineshop;


public class Order {
    
    private int o_id;
    private boolean o_status;
    private String o_date;

    public Order(int o_id, boolean o_status, String o_date) {
        this.o_id = o_id;
        this.o_status = o_status;
        this.o_date = o_date;
    }


  /*  
    public void setInfo(int id,boolean status,String date)
    {
        this.o_id = id;
        this.o_status = status;
        this.o_date = date;
        
    }*/

    public int getO_id() {
        return o_id;
    }

    public boolean isO_status() {
        return o_status;
    }

    public String getO_date() {
        return o_date;
    }
    

   
    
    
    
    public void detail()
    {
        System.out.println("product id : " + o_id + " " + " product status : " + o_status + " " + " ordering date : " + o_date);
    }
    
    
    
    
    
    
    
    
    
    
}
