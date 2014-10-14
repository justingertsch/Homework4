/**
 * Created by Justin on 10/13/14.
 */
public class HighResPrintDriver implements PrintDriver
{
    private volatile static HighResPrintDriver uniqueInstance = null;

    private HighResPrintDriver() {}

    public static HighResPrintDriver getInstance()
    {
        if(uniqueInstance == null)
        {
            synchronized (HighResPrintDriver.class)
            {
                if(uniqueInstance == null)
                {
                    uniqueInstance = new HighResPrintDriver();
                }
            }
        }
        return uniqueInstance;
    }

    public void print()
    {
        System.out.println("Printing a Document using a HighResPrintDriver ");
    }
}
