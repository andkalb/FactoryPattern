class NVStraightSlotMachine extends NVSlotMachine {
    public NVStraightSlotMachine() {
        cabinet = "large";
        display = "reels";
        payment = "ticketinticketout";
        CPU = "ARM";
        OS = "Linux";
    }
    public void play() {
        System.out.println("Playing a Nevada Straight Slot Machine...");
    }
}