package ksv.com.smarthouse;

public class FirstRoom extends Apartments {
    String numberRoom = "№36";

    public void addressSH() {
        System.out.println(address + numberRoom);
    }

    public void disableLights() {
        System.out.println(SmartHouse.currentDateAndTime() + " - The light on the window sill in the room " + numberRoom + " switches off because late night comes ...");
    }

    public void numbersOfRoomsAndNameOfPlants() {
        System.out.println(SmartHouse.currentDateAndTime() + " - Good night my dear citruses and money tree on the window sill in the room " + numberRoom);
        System.out.println("========================");
        System.out.println(" ");
    }
}


