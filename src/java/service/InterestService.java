package service;

import bank.Account;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/InterestService")
public class InterestService {

    Account account = new Account();

    @POST
    @Path("/getInterest")
    @Consumes("application/json")
    @Produces("application/json")
    public String getInterest(String json) {
        JsonObject jsonP = new JsonParser().parse(json).getAsJsonObject();
        try {
            return (""+account.getInterest(Double.parseDouble(jsonP.get("input").getAsString())));
            //return parsedInput;
        } catch (Exception e) {
            e.printStackTrace();
            return "error";
        }

    }

}
