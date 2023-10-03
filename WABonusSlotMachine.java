class WABonusSlotMachine extends WASlotMachine {
    public WABonusSlotMachine() {
        cabinet = "medium";
        display = "VGA";
        payment = "ticketinticketout";
        CPU = "ARM";
        OS = "Symbian";
    }
    public void play() {
        System.out.println("Playing a Washington Bonus Slot Machine...");
    }
}