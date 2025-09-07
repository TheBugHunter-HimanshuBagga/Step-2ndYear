public class AudioMixer {
    private String mixerModel;
    private int numberOfChannels;
    private boolean hasBluetoothConnectivity;
    private double maxVolumeDecibels;
    private String[] connectedDevices;
    private int deviceCount;

    // No-argument constructor
    public AudioMixer() {
        this("StandardMix-8", 8, false); // chaining to 3-param constructor
    }

    // Two-parameter constructor
    public AudioMixer(String mixerModel, int numberOfChannels) {
        this(mixerModel, numberOfChannels, false); // chaining to 3-param constructor
    }

    // Three-parameter constructor
    public AudioMixer(String mixerModel, int numberOfChannels, boolean hasBluetoothConnectivity) {
        this(mixerModel, numberOfChannels, hasBluetoothConnectivity, 120.0); // chaining to main constructor
    }

    // Main constructor - all parameters
    public AudioMixer(String mixerModel, int numberOfChannels, boolean hasBluetoothConnectivity, double maxVolumeDecibels) {
        this.mixerModel = mixerModel;
        this.numberOfChannels = numberOfChannels;
        this.hasBluetoothConnectivity = hasBluetoothConnectivity;
        this.maxVolumeDecibels = maxVolumeDecibels;

        // initialize connected devices array based on channels
        this.connectedDevices = new String[numberOfChannels];
        this.deviceCount = 0;

        System.out.println(">> Constructor executed for " + mixerModel);
    }

    // Method to connect a device
    public void connectDevice(String deviceName) {
        if (deviceCount < connectedDevices.length) {
            connectedDevices[deviceCount] = deviceName;
            deviceCount++;
            System.out.println("Connected: " + deviceName);
        } else {
            System.out.println("All channels occupied!");
        }
    }

    // Method to display mixer status
    public void displayMixerStatus() {
        System.out.println("=== " + mixerModel + " STATUS ===");
        System.out.println("Channels: " + numberOfChannels);
        System.out.println("Bluetooth: " + (hasBluetoothConnectivity ? "Enabled" : "Disabled"));
        System.out.println("Max Volume: " + maxVolumeDecibels + " dB");
        System.out.println("Connected Devices: " + deviceCount + "/" + numberOfChannels);

        for (int i = 0; i < deviceCount; i++) {
            System.out.println(" Channel " + (i + 1) + ": " + connectedDevices[i]);
        }
        System.out.println("------------------------------");
    }

    // Main method to test
    public static void main(String[] args) {
        System.out.println("=== MUSIC STUDIO SETUP ===");

        // Create mixers with different constructors
        AudioMixer mixer1 = new AudioMixer();
        AudioMixer mixer2 = new AudioMixer("StudioMix-16", 16);
        AudioMixer mixer3 = new AudioMixer("DJ-Master", 12, true);
        AudioMixer mixer4 = new AudioMixer("MegaMix-Pro", 24, true, 140.0);

        // Connect devices
        mixer1.connectDevice("Mic 1");
        mixer1.connectDevice("Guitar");

        mixer2.connectDevice("Keyboard");
        mixer2.connectDevice("Drums");

        mixer3.connectDevice("Laptop");
        mixer3.connectDevice("Synthesizer");

        mixer4.connectDevice("DJ Console");
        mixer4.connectDevice("Turntable");
        mixer4.connectDevice("Speaker Set");

        // Display status of all mixers
        mixer1.displayMixerStatus();
        mixer2.displayMixerStatus();
        mixer3.displayMixerStatus();
        mixer4.displayMixerStatus();

        System.out.println("=== End of Constructor Chaining Demo ===");
    }
}
