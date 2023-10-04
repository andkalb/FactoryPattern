class NJStraightSlotMachine extends NJSlotMachine {
    public NJStraightSlotMachine() {
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