public class LightAppliance extends Appliance {
    private String bulbType;

    public LightAppliance(String name, double powerRating, String lightBulbType) {
        super(name, "Light", powerRating);
        setBulbType(lightBulbType);
    }

    public String getBulbType() {
        return bulbType;
    }

    public void setBulbType(String lightBulbType) {
        if (lightBulbType == null) {
            bulbType = "General Bulb";
        }
        else if (lightBulbType.equals("")) {
            bulbType = "General Bulb";
        }
        else {
            bulbType = lightBulbType;
        }
    }

    public double calculateEnergyConsumption() {
        double energy = (getPowerRating() * getUsageHours()) / 1000;
        setEnergyConsumed(energy);
        return energy;
    }

    public void displayInfo() {
        System.out.println("Appliance Name: " + getName());
        System.out.println("Type: " + getType());
        System.out.println("Bulb Type: " + bulbType);
        System.out.println("Power Rating: " + getPowerRating() + " watts");
        System.out.println("Usage Hours: " + getUsageHours() + " hours");
        System.out.println("Energy Consumed: " + getEnergyConsumed() + " kWh");
    }
}
