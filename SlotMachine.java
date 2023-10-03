abstract class SlotMachine {
    protected String cabinet;
    protected String display;
    protected String payment;
    protected String CPU;
    protected String OS;
    abstract public void play();
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
    public String getCPU() {
        return CPU;
    }
    public void setCPU(String newCPU) {
        CPU = newCPU;
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