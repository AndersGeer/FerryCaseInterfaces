/**
 * Created by geera on 20-Sep-16.
 */
public class CustomerInfo extends CustomerInfoOnReservation
{
    private String email;

    public CustomerInfo(int customerId, String firstName, int phoneNumber, String lastName, String email) {
        super(customerId, firstName, phoneNumber, lastName);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
