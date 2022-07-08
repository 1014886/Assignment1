package Q15;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Item {
	  
    	 int itemid;
	    String itemname;
	    double cost_price,sell_price; 
	    String date_of_manufacturing, date_of_expiring;

	    public int getItemid() {
	        return itemid;
	    }
	    public void setItemid(int itemid) {
	        this.itemid = itemid;
	    }
	    public String getItemname() {
	        return itemname;
	    }
	    public void setItemname(String itemname) {
	        this.itemname = itemname;
	    }
	    public double getCost_price() {
	        return cost_price;
	    }
	    public void setCost_price(double cost_price) {
	        this.cost_price = cost_price;
	    }
	    public double getSell_price() {
	        return sell_price;
	    }
	    public void setSell_price(double sell_price) {
	        this.sell_price = sell_price;
	    }
	}
	   class Que15item {

	    public static boolean checkItem(int itemid,String itemname,double cost_price,double sell_price,
	    String date_of_manufacturing, String date_of_expiring) throws Exception {

	        Item i = new Item();

	        i.itemid = itemid;
	        i.itemname = itemname;
	        i.cost_price = cost_price;
	        i.sell_price = sell_price;
	        i.date_of_manufacturing = date_of_manufacturing;
	        i.date_of_expiring = date_of_expiring;

	        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");  
	        Date date = new Date();  
	        

	        Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(date_of_expiring);

	        if(itemid >= 100 && itemname.matches( "^[a-zA-Z]*$") && cost_price > 0 && cost_price != sell_price && date1 != date)
	            return true;
	        else 
	            return false;    

	    }
	}

