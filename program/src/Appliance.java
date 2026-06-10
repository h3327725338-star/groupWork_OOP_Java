public class Appliance {
    private String name;
    private String type;
    private double powerRating;
    private double usageHours;
    private double energyConsumed;

    public Appliance(String applianceName, String applianceType, double rating) {
        if (applianceName == null) {
            name = "Unknown Appliance";
        }

        else if (applianceName.equals("")) {
            name = "Unknown Appliance";
        }

        else {
            name = applianceName;
        }

        if (applianceType == null) {
            type = "General";
        }

        else if (applianceType.equals("")) {
            type = "General";
        }

        else {
            type = applianceType;
        }

        if (rating < 0) {
            powerRating = 0;
        }

        else {
            powerRating = rating;
        }

        usageHours = 0;
        energyConsumed = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String applianceName) {
        if (applianceName == null) {
            name = "Unknown Appliance";
        }

        else if (applianceName.equals("")) {
            name = "Unknown Appliance";
        }

        else {
            name = applianceName;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String applianceType) {
        if (applianceType == null) {
            type = "General";
        }

        else if (applianceType.equals("")) {
            type = "General";
        }

        else {
            type = applianceType;
        }
    }

    public double getPowerRating() {
        return powerRating;
    }

    public void setPowerRating(double rating) {
        if (rating < 0) {
            powerRating = 0;
        }

        else {
            powerRating = rating;
        }
    }

    public double getUsageHours() {
        return usageHours;
    }

    public void setUsageHours(double hours) {
        if (hours < 0) {
            usageHours = 0;
        }

        else {
            usageHours = hours;
        }
    }

    public double getEnergyConsumed() {
        return energyConsumed;
    }

    public void setEnergyConsumed(double energy) {
        if (energy < 0) {
            energyConsumed = 0;
        }

        else {
            energyConsumed = energy;
        }
    }

    public double calculateEnergyConsumption() {
        energyConsumed = (powerRating * usageHours) / 1000;
        return energyConsumed;
    }

    public void displayInfo() {
        System.out.println("Appliance Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Power Rating: " + powerRating + " watts");
        System.out.println("Usage Hours: " + usageHours + " hours");
        System.out.println("Energy Consumed: " + energyConsumed + " kWh");
    }
}
