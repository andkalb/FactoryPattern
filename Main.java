
public class Main
{
    public static void main(String[] args)
    {
        // client is here?
        SlotMachineFactory factory = new NJFactory();
        System.out.println("The Taj Mahal orders a:");
        factory.order("Bonus");

        factory = new NVFactory();
        System.out.println("The Peppermill orders a:");
        factory.order("Progressive");

    }
}
