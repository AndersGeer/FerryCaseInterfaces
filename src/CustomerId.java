import java.rmi.server.UID;

/**
 * Created by geera on 20-Sep-16.
 */
public class CustomerId
{
    private int customerId;

    public CustomerId(int customerId)
    {
        this.customerId = customerId;
    }

    public int getCustomerId()
    {
        return customerId;
    }
}
