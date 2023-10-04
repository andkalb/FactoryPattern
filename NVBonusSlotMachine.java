class NVBonusSlotMachine extends NVSlotMachine {
    public NVBonusSlotMachine() {
        cabinet = "small";
        display = "CRT";
        payment = "ticketinticketout";
        CPU = "X86";
        OS = "Linux";
    }
    public void play() {
        System.out.println("Playing a Nevada Bonus Slot Machine...");
    }
}