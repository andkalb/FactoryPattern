
public class Main
{
    public static void main(String[] args)
    {
        // client is here?
        SlotMachineFactory factory = new NJFactory();
        
        factory.order("Bonus");

        factory = new NVFactory();

        factory.order("Progressive");

    }
}
