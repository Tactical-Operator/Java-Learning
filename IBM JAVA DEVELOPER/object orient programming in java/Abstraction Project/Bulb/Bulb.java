
// interface for devices that can be turned on/off
interface Switchable {
    void turnOn();

    void turnOff();
}

// interface for devices with adjustable settings
interface Adjustable {
    void increase();

    void decrease();
}

// interface for devices that can connect to a network

interface Connectable {
    void connect();

    void disconnect();
}

// Smart Bulb class implementing all the three interfaces
class SmartBulb implements Switchable, Adjustable, Connectable {

    private boolean isOn = false;
    private int brightness = 50;
    private boolean isConnected = false;

    // Switchable methods
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("SmartBulb is turned ON");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("SmartBulb is turned OFF");
    }

    // Adjustable Methods
    @Override
    public void increase() {
        if (brightness < 100) {
            brightness += 10;
            System.out.println("Smart Bulb Brightness increase to " + brightness + "%.");
        } else {
            System.out.println("Smart Bulb Brightness is already at 100");
        }
    }

    @Override
    public void decrease() {
        if (brightness > 0) {
            brightness -= 10;
            System.out.println(" Smart Bulb Brightness decrease to " + brightness + "%.");
        } else {
            System.out.println("Smart Bulb Brigthness is already at 0");
        }
    }

    // Connectable Methods
    @Override
    public void connect() {
        isConnected = true;
        System.out.println("Smart Bulb is connected to the network");
    }

    @Override
    public void disconnect() {
        isConnected = false;
        System.out.println("Smart Bulb is disconnected from the network");
    }
}

// DimmableBulb class implementing 2 interfaces
class DimmableBulb implements Switchable, Adjustable {
    private boolean isOn = false;
    private int brightness = 50;

    // Switchable methods
    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Dimmable bulb is turned on");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Dimmable bulb is turned off");
    }

    // Adjustable Methods
    @Override
    public void increase() {
        if (brightness < 100) {
            brightness += 10;
            System.out.println("Dimmable Bulb Brightness increase to " + brightness + "%.");
        } else {
            System.out.println("Dimmable Bulb Brightness is already at 100");
        }
    }

    @Override
    public void decrease() {
        if (brightness > 0) {
            brightness -= 10;
            System.out.println("Dimmable Brightness decrease to " + brightness + "%.");
        } else {
            System.out.println("Dimmable Brigthness is already at 0");
        }
    }
}

// Regular Bulb class will only implement switchable
class RegularBulb implements Switchable {
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("RegularBulb has been turned on");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("RegularBulb has been turned off");

    }

}
