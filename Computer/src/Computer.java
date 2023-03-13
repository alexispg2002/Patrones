class Computer {
    //A
    //required fields
    private String HDD;
    private String RAM;

    //optional fields
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    public static class ComputerBuilder {
        //required
        private String HDD;
        private String RAM;

        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;

        //optional
        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
    //B
    public static void main(String[] args) {
        class Main {
            public void main(String[] args) {
                Computer myComputer = new Computer.ComputerBuilder("1TB", "8GB")
                        .setGraphicsCardEnabled(true)
                        .setBluetoothEnabled(false)
                        .build();

                System.out.println("My computer has: " + myComputer.HDD + " HDD, " + myComputer.RAM + " RAM, " +
                        (myComputer.isGraphicsCardEnabled ? "a graphics card" : "no graphics card") +
                        " and " + (myComputer.isBluetoothEnabled ? "Bluetooth enabled" : "Bluetooth disabled"));
            }
        }

    }
    //C
    private Computer(String HDD, String RAM, boolean isGraphicsCardEnabled, boolean isBluetoothEnabled) {
        this.HDD = HDD;
        this.RAM = RAM;
        this.isGraphicsCardEnabled = isGraphicsCardEnabled;
        this.isBluetoothEnabled = isBluetoothEnabled;
    }

    public static ComputerBuilder builder(String HDD, String RAM) {
        return new ComputerBuilder(HDD, RAM);
    }
}

