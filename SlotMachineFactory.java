public interface SlotMachineFactory
{
    private SlotMachine build(String type);
    public SlotMachine order(String type);
}