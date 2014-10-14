/**
 * Created by Justin on 10/13/14.
 */
public class LowResDisplayDriver implements DisplayDriver
{
    private volatile static LowResDisplayDriver uniqueInstance = null;

    private LowResDisplayDriver() {}

    public static LowResDisplayDriver getInstance()
    {
        if(uniqueInstance == null)
        {
            synchronized (LowResDisplayDriver.class)
            {
                if(uniqueInstance == null)
                {
                    uniqueInstance = new LowResDisplayDriver();
                }
            }
        }
        return uniqueInstance;
    }

    public void draw()
    {
        System.out.println("Drawing a Widget using a LowResDisplayDriver ");
    }
}
