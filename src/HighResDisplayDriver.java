/**
 * Created by lucian on 10/13/14.
 */
public class HighResDisplayDriver implements DisplayDriver
{
    private volatile static HighResDisplayDriver uniqueInstance = null;

    private HighResDisplayDriver() {}

    public static HighResDisplayDriver getInstance()
    {
        if(uniqueInstance == null)
        {
            synchronized (HighResDisplayDriver.class)
            {
                if(uniqueInstance == null)
                {
                    uniqueInstance = new HighResDisplayDriver();
                }
            }
        }
        return uniqueInstance;
    }

    public void draw()
    {
        System.out.println("Drawing a Widget using a HighResDisplayDriver ");
    }
}
