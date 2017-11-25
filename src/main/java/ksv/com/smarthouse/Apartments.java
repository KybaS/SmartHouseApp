package ksv.com.smarthouse;

abstract class Apartments extends Lights implements ClimateInRooms, Energy {

    public void runCooling() {
        System.out.println(SmartHouse.currentDateAndTime() + " - Cooling is enabled, for this smart house " + "(Temperature = " + getTemperature() + "Cͦ)");
    }

    public void runHeating() {
        System.out.println(SmartHouse.currentDateAndTime() + " - Heating is enabled, for this smart house, because the temperature dropped below 17 degrees Celsius " + " (Temperature = " + getTemperature() + "Cͦ)");
    }

    public void stopAll() {
        System.out.println(SmartHouse.currentDateAndTime() + " - Heating and Cooling disabled. In the smart house, people are feeling great! " + " (Temperature = " + getTemperature() + "Cͦ)");
    }


    public int thermometer() {
        int i = (int) ((Math.random() * 10) + 16);
        return i;
    }

    public void correctClimate() {
        if (getTemperature() <= 17) {
            runHeating();
        } else if (getTemperature() >= 18 & getTemperature() <= 22) {
            stopAll();
        } else if (getTemperature() >= 23) {
            runCooling();
        } else {
            System.out.println(SmartHouse.currentDateAndTime() + " - Life is good! But we have some issue with our thermometer... " + " (Temperature = " + getTemperature() + "Cͦ)");
        }
    }

    //Energy Block
    int temperature;
    double solarResult;
    double windResult;
    double consumptionResult;

    Apartments() {
        solarResult = solarCleanEnergyDay();
        windResult = windCleanEnergyDay();
        consumptionResult = consumptionEnergyDayByHouse();
        temperature = thermometer();
    }

    int getTemperature() {
        return temperature;
    }

    double getSolarResult() {
        return solarResult;
    }

    double getWindResult() {
        return windResult;
    }

    public double getConsumptionResult() {
        return consumptionResult;
    }

    public double solarCleanEnergyDay() {
        double s = ((Math.random() * 10) + 17);
        return s;
    }

    public double windCleanEnergyDay() {
        double w = ((Math.random() * 10) + 16);
        return w;
    }

    public double consumptionEnergyDayByHouse() {
        double i = ((Math.random() * 10) + 28);
        return i;
    }

    public void solarEnergy() {
        System.out.println(SmartHouse.currentDateAndTime() + " - Solar power station has produced " + getSolarResult() + " kW clean energy!");
    }

    public void windEnergy() {
        System.out.println(SmartHouse.currentDateAndTime() + " - Wind power station has produced " + getWindResult() + " kW clean energy!");
    }

    public void energyConsumptionPerDay() {
        System.out.println(SmartHouse.currentDateAndTime() + " - Smart House has consumed " + getConsumptionResult() + " kW energy per day");
    }

    public double result() {
        double r = ((getSolarResult() + getWindResult()) - getConsumptionResult());
        return r;
    }

    public void totalEnergyDay() {
        System.out.println(SmartHouse.currentDateAndTime() + " - Overplus / Overspending = " + result() + " kW");
    }
}
