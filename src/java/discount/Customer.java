package discount;

public class Customer {

    public int getDiscount(boolean newCustomer, boolean loyaltyCard, boolean coupon) {
        int discount = 0;

        if (newCustomer) {
            discount = 15;

            if (coupon) {
                discount = 20;
            }

            if (loyaltyCard) {
                discount = 0;
            }
        } else {
            if (coupon) {
                discount = 20;
            }

            if (loyaltyCard) {
                discount += 10;
            }
        }

        return discount;
    }
}
