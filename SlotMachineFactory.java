public interface SlotMachineFactory
{
    // private method build does not compile in an interface
    public SlotMachine order(String type);
}