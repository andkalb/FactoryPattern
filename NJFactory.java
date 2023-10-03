
public NJFactory implements SlotMachineFactory
{
    private SlotMachine slotMachine;

    private SlotMachine build(String type)
    {
        SlotMachine machine;

        if (type == "Bonus")
        {
            machine = new NJBonusSlotMachine();
        }
        else if (type == "Straight")
        {
            machine = new NJStraightSlotMachine();
        }
        else if (type == "Progressive")
        {
            machine = new NJProgressiveSlotMachine();
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
        System.out.println("Making a New Jersey Style " + type + " slot machine");
        System.out.println("fetching components: " + machine.getCabinet() + " " + machine.getPayment() + " " + machine.getCPU());
        System.out.println("assembling components");
        System.out.println("uploading software " + machine.getOS());
        System.out.println("testing software");
        System.out.println("wrapping, and delivering");

        return machine;
    }
}