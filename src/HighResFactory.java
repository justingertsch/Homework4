/**
 * Created by Justin on 10/13/14.
 */
public class HighResFactory implements DriverFactory
{
    public PrintDriver CreatePrintDriver()
    {
        return HighResPrintDriver.getInstance();
    }

    public DisplayDriver CreateDisplayDriver()
    {
        return HighResDisplayDriver.getInstance();
    }
}
