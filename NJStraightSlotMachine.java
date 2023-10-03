class NVStraightSlotMachine extends NVSlotMachine {
    public NVStraightSlotMachine() {
        cabinet = "small";
        display = "LCD";
        payment = "coins";
        CPU = "ARM";
        OS = "Windows ME";
    }
    public void play() {
        System.out.println("Playing a New Jersey Straight Slot Machine...");
    }
}