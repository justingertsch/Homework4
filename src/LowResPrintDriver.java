/**
 * Created by Justin on 10/13/14.
 */
public class LowResPrintDriver implements PrintDriver
{
    private volatile static LowResPrintDriver uniqueInstance = null;

    private LowResPrintDriver() {}

    public static LowResPrintDriver getInstance()
    {
        if(uniqueInstance == null)
        {
            synchronized (LowResPrintDriver.class)
            {
                if(uniqueInstance == null)
                {
                    uniqueInstance = new LowResPrintDriver();
                }
            }
        }
        return uniqueInstance;
    }

    public void print()
    {
        System.out.println("Printing a Document using a LowResPrintDriver ");
    }
}
