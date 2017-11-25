package ksv.com.smarthouse;

public class SecondRoom extends Apartments {
    String numberRoom = "№34";

    public void addressSH() {
        System.out.println(address + numberRoom);
    }

    public void disableLights() {
        System.out.println(SmartHouse.currentDateAndTime() + " - The light on the window sill in the room " + numberRoom + " switches off because late night comes ...");
        System.out.println(" ");
    }

    public void numbersOfRoomsAndNameOfPlants() {
        System.out.println(SmartHouse.currentDateAndTime() + " - Have a nice night, my dear plants in the room " + numberRoom);
        System.out.println("::::::::::::::::::::::::");
        System.out.println(" ");
    }

    int outsideLightSensor = 99; //custom value outside light sensor for this room

    public void lightsForWindows() { //overridden method
        if (outsideLightSensor < 45) {
            runLights();
            System.out.println(SmartHouse.currentDateAndTime() + " - Light is enabled, for plants on the window sill in the room " + numberRoom);
        } else {
            System.out.println(SmartHouse.currentDateAndTime() + " - Lighting is enough for plants, the backlight doesn't turn on, too early " + "(lx = " + getSensorValue() + ")");
        }
    }
}
