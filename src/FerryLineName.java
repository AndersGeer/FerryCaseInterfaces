/**
 * Created by geera on 20-Sep-16.
 */
public class FerryLineName extends FerryLineId
{
    private String ferryLineName;

    public FerryLineName(String ferryLineName, int ferryLineId) {
        super(ferryLineId);
        this.ferryLineName = ferryLineName;
    }

    public String getFerryLineName() {
        return ferryLineName;
    }
}
