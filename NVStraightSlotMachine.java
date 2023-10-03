class NVStraightSlotMachine extends NVSlotMachine {
    public NVStraightSlotMachine() {
        cabinet = "large";
        display = "reels";
        payment = "ticketinticketout";
        GPU = "ARM";
        OS = "Linux";
    }
    public play() {
        System.out.println("Playing a Nevada Straight Slot Machine...");
    }
}