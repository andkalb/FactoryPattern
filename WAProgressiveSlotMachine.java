class WAProgressiveSlotMachine extends WASlotMachine {
    public WAProgressiveSlotMachine() {
        cabinet = "large";
        display = "reels";
        payment = "coin";
        CPU = "ARM";
        OS = "Android";
    }
    public void play() {
        System.out.println("Playing a Washington Progressive Slot Machine...");
    }
}