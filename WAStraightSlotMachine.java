class WAStraightSlotMachine extends WASlotMachine {
    public WAStraightSlotMachine() {
        cabinet = "large";
        display = "reels";
        payment = "bills";
        CPU = "ARM";
        OS = "Linux";
    }
    public void play() {
        System.out.println("Playing a Washington Straight Slot Machine...");
    }
}