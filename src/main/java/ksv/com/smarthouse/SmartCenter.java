package ksv.com.smarthouse;

import ksv.com.smarthouse.frontendpart.View;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class SmartCenter {
    public static void main(String[] args) throws FileNotFoundException {

        View trys = new View();
        trys.newArea();

        try {
            System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("stdout.log")), true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        while (true) { //cycle for reload app
            Controller go = new Controller();

            SmartHouse house = new SmartHouse() {
                @Override
                public void addressSH() {
                    super.addressSH();
                }
            };
            try {
                go.start();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (false) {
                break;
            }
        }
    }
}
