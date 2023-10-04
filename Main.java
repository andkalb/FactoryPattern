
public class Main
{
    public static void main(String[] args)
    {
        // client is here?
        SlotMachineFactory factory = new NJFactory();
        System.out.println("The Taj Mahal orders a:");
        factory.order("Bonus");

        System.out.println("The Casino Estoril orders a:");
        factory.order("Straight");

        System.out.println("The Casino de Monte Carlo orders a:");
        factory.order("Progressive");

        factory = new NVFactory();

        System.out.println("The GSR orders a:");
        factory.order("Bonus");

        System.out.println("The Silver Legacy orders a:");
        factory.order("Straight");

        System.out.println("The Peppermill orders a:");
        factory.order("Progressive");

        factory = new WAFactory();

        System.out.println("The British Embassy orders a:");
        factory.order("Bonus");

        System.out.println("The Pyeongyang Foreign Affairs Office orders a:");
        factory.order("Straight");

        System.out.println("The Nepalese Government orders a:");
        factory.order("Progressive");

    }
}
