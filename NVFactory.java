
public class NVFactory implements SlotMachineFactory
{
    private SlotMachine slotMachine;

    private SlotMachine build(String type)
    {
        SlotMachine machine = null;

        if (type == "Bonus")
        {
            machine = new NVBonusSlotMachine();
        }
        else if (type == "Straight")
        {
            machine = new NVStraightSlotMachine();
        }
        else if (type == "Progressive")
        {
            machine = new NVProgressiveSlotMachine();
        }
        else
        {
            // unknown type
        }
        return machine;
    }

    public SlotMachine order(String type)
    {
        SlotMachine machine = build(type);
        System.out.println("--- Making a Nevada Style " + type + " slot machine ---");
        System.out.println("fetching components: " + machine.getCabinet() + "cabinet, " + machine.getPayment() + " validator, " + machine.getDisplay() + " display, " + machine.getCPU());
        System.out.println("assembling components");
        System.out.println("uploading software: " + machine.getOS());
        System.out.println("testing software");
        System.out.println("wrapping, and delivering");
        System.out.println();
        return machine;
    }
}