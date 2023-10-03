abstract class SlotMachine {
    private String cabinet;
    private String display;
    private String payment;
    private String GPU;
    private String OS;
    public SlotMachine();
    public play();
    public String getCabinet() {
        return cabinet;
    }
    public void setCabinet(String newCabinet) {
        cabinet = newCabinet;
    }
    public String getPayment() {
        return payment;
    }
    public void setPayment(String newPayment) {
        payment = newPayment;
    }
    public String getGPU() {
        return GPU;
    }
    public void setCPU(String newGPU) {
        GPU = newGPU;
    }
    public String getDisplay() {
        return display;
    }
    public void setDisplay(String newDisplay) {
        display = newDisplay;
    }
    public String getOS() {
        return OS;
    }
    public void setOS(String newOS) {
        OS = newOS;
    }
}