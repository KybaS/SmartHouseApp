package ksv.com.smarthouse;

import java.util.Timer;
import java.util.TimerTask;

public abstract class Lights extends SmartHouse {

    int sensorValue;

    Lights() {
        sensorValue = newValueOfLights();
    }

    int getSensorValue() {
        return sensorValue;
    }

    private int newValueOfLights() { //random value for outside light sensor
        int outsideLightSensor = (int) ((Math.random() * 10) + 45); //Light sensor has min. and max. values, e.g. max. - 100 it's very sunny and min. - 0 it's dark night
        return outsideLightSensor;
    }

    public void lightsForWindows() {
        if (getSensorValue() < 50) { //if the light sensor has value less 50 - it's getting dark
            runLights();
            System.out.println(SmartHouse.currentDateAndTime() + " - Light is enabled, for plants on the window sill! " + "(lx = " + getSensorValue() + ")");
        } else {
            System.out.println(SmartHouse.currentDateAndTime() + " - Lighting is enough for plants, the backlight doesn't turn on, too early " + "(lx = " + getSensorValue() + ")");
        }
    }

    public void runLights() {
        final Timer time = new Timer();

        time.schedule(new TimerTask() {
            int i = 0;

            @Override
            public void run() {
                if (i >= 1) {
                    System.out.println(" ");
                    numbersOfRoomsAndNameOfPlants();
                    time.cancel();
                    return;
                }
                disableLights();
                i = i + 1;
            }
        }, 6000, 2000); //(240000 (4 hours) - wait 4 hours to start disableLights(), repeat every period)
    }

    public void disableLights() {
        System.out.println(SmartHouse.currentDateAndTime() + " - The light on the window sill switches off because late night comes ...");
    }

    public void numbersOfRoomsAndNameOfPlants() {
        System.out.println("***********************");
        System.out.println(SmartHouse.currentDateAndTime() + " - Have a nice night, my dear plants!");
    }

    public void enableLights(int insideLightSensor, boolean ir) { //method for light in the room, sensor inside in room.
        if (ir == true & insideLightSensor < 45) {
            System.out.println(SmartHouse.currentDateAndTime() + " - Turning on the light because it becomes dark in the room!");
        } else {
            System.out.println(SmartHouse.currentDateAndTime() + " - The light is not switched on because one of the conditions is not fulfilled, the first one in the street is to darken, and the second in the room must be the movement.");
        }
    }

//    public void enableLights(double levelSoundOne, boolean ir) {   //methods in development
//        if (ir == true & levelSoundOne > 50) {
//            System.out.println("Вмикається світло по хлопку");
//        }
//    }
//
//    public void disableLights(int insideLightSensor, boolean ir) {
//        if (ir == false && insideLightSensor > 45) {
//            System.out.println("Світло вимикається");
//        }
//    }
//
//    public void disableLights(double levelSoundTwo, boolean ir) {
//        if (ir == false & levelSoundTwo > 50) {
//            System.out.println("Світло вимикається по подвійному хлопку");
//        }
//    }
}

