public class Main {
    private String HDD;
    private String RAM;
    boolean isGraphicsCardEnabled;
    boolean isBluetoothEnabled;
    Main(String HDD, String RAM, boolean isGraphicsCardEnabled,
    boolean isBluetoothEnabled){
        this.HDD=HDD;
        this.RAM=RAM;
        this.isGraphicsCardEnabled=isGraphicsCardEnabled;
        this.isBluetoothEnabled=isBluetoothEnabled;
    }

    public void setBluetoothEnabled(boolean bluetoothEnabled) {
        isBluetoothEnabled = bluetoothEnabled;
    }

    public void setGraphicsCardEnabled(boolean graphicsCardEnabled) {
        isGraphicsCardEnabled = graphicsCardEnabled;
    }
}