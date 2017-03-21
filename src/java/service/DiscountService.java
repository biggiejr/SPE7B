package service;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import discount.Customer;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/DiscountService/")
public class DiscountService {

    private double discount = 0;
    Customer customer = new Customer();

    @POST
    @Path("/getDiscount")
    @Consumes("application/json")
    @Produces("application/json")
    public String getDiscount(String json) {
        JsonObject jsonP = new JsonParser().parse(json).getAsJsonObject();
        
        boolean newCustomer = Boolean.parseBoolean(jsonP.get("newCustomer").getAsString());
        boolean loyaltyCard = Boolean.parseBoolean(jsonP.get("loyaltyCard").getAsString());
        boolean coupon = Boolean.parseBoolean(jsonP.get("coupon").getAsString());
        try {
            return (""+customer.getDiscount(newCustomer, loyaltyCard, coupon));
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }

    }

}
