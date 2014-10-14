/**
 * Created by Justin on 10/13/14.
 */
public class LowResFactory implements DriverFactory
{

    public PrintDriver CreatePrintDriver()
    {
        return LowResPrintDriver.getInstance();
    }

    public DisplayDriver CreateDisplayDriver()
    {
        return LowResDisplayDriver.getInstance();
    }
}
