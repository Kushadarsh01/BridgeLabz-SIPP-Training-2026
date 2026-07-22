package oopsjavapractice.scenariobased.couponvalidator;

public class CouponValidatorMain {
    public static void main(String[] args) {
        String[] coupons = {
                "Save123",
                "Hii 123",
                "SHA-256",
                "SAVE6789",
                "SaVe123",
                "savedgsg42424"
        };

        ICouponValidator validator = new ShoppingCart();

        for (String coupon : coupons) {
            if (validator.couponValidator(coupon)) {
                System.out.println(coupon + ":- is a valid Coupon");
            }
            else {
                System.out.println(coupon + ":- is not a valid Coupon");
            }
        }
    }
}
