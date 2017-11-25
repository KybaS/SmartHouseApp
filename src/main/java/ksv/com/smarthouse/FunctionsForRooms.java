package ksv.com.smarthouse;

public class FunctionsForRooms {
    public void giveLevelOfLights(Lights plusL) throws InterruptedException {
        plusL.addressSH();
        plusL.enableLights(40, false);
        plusL.lightsForWindows();
    }

    public void giveClimateContr(Apartments climats) {
        climats.correctClimate();
    }

    public void giveEnergyData(Apartments energy){
        energy.solarEnergy();
        energy.windEnergy();
        energy.energyConsumptionPerDay();
        energy.totalEnergyDay();
    }
}
