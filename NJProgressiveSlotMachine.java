class NJProgressiveSlotMachine extends NJSlotMachine {
    public NJProgressiveSlotMachine() {
        cabinet = "small";
        display = "CRT";
        payment = "bills";
        CPU = "X86";
        OS = "Windows XP";
    }
    public void play() {
        System.out.println("Playing a New Jersey Progressive Slot Machine...");
    }
}