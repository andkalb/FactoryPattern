class NVBonusSlotMachine extends NVSlottMachine {
    public NVBonusSlotMachine() {
        cabinet = "small";
        display = "CRT";
        payment = "ticketinticketout";
        GPU = "X87";
        OS = "Linux";
    }
    public play() {
        System.out.println("Playing a Nevada Bonus Slot Machine...");
    }
}