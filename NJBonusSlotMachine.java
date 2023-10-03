class NJBonusSlotMachine extends NJSlotMachine {
    public NJBonusSlotMachine() {
        cabinet = "large";
        display = "reels";
        payment = "coins";
        CPU = "ARM";
        OS = "Windows ME";
    }
    public void play() {
        System.out.println("Playing a New Jersey Bonus Slot Machine...");
    }
}