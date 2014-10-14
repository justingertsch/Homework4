/**
 * Created by Justin on 10/13/14.
 */
public class Device
{
    private DriverFactory df = null;
    private DisplayDriver dd = null;
    private PrintDriver pd = null;

    public Device(DriverFactory df)
    {
        this.df = df;
        dd = this.df.CreateDisplayDriver();
        pd = this.df.CreatePrintDriver();

    }

    public void print()
    {
        this.pd.print();
    }

    public void draw()
    {
        this.dd.draw();
    }

    public static void main(String[] args)
    {
        Device highResDevice = new Device(new HighResFactory());
        highResDevice.print();
        highResDevice.draw();

        Device lowResDevice = new Device(new LowResFactory());
        lowResDevice.print();
        lowResDevice.draw();

    }
}
