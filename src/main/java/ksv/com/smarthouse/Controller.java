package ksv.com.smarthouse;

public class Controller {
    public void start() throws InterruptedException {
        FunctionsForRooms functions = new FunctionsForRooms();
        FirstRoom firstR = new FirstRoom();
        SecondRoom secondR = new SecondRoom();

        System.out.println("36 room:");
        functions.giveLevelOfLights(firstR);
        functions.giveClimateContr(firstR);
        System.out.println(" - Energy block: ");
        functions.giveEnergyData(firstR);
        System.out.println(" ");
        Thread.sleep(5000); //every this time occurs recheck value from outside light sensor for this room

        System.out.println("34 room:");
        functions.giveLevelOfLights(secondR);
        functions.giveClimateContr(secondR);
        System.out.println(" - Energy block: ");
        functions.giveEnergyData(secondR);
        System.out.println(" ");
        Thread.sleep(60000); //every this time occurs recheck value from outside light sensor for this room

        System.out.println("");
        System.out.println("Next day / next test");
    }
}
