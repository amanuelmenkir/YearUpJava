package com.yearup.week2.homework;
import java.util.Scanner;
interface CelestialObject{
    void displayCelestialObject();
}
public class Executor extends solarSystemPlanet{

    static Scanner scan = new Scanner(System.in);
    static solarSystemPlanet solsysplanet = new solarSystemPlanet();
    public static void main(String[]args){

    }
    public static void planetBelonging(){
        System.out.println("Your Planet belongs to Milky way galaxy");
    }
    enum PlanetName{
        Mercury(0),Venus(0),Earth(1),Mars(2),Jupiter(80),Uranus(83),Neptune(14);
        public final int moons;
        PlanetName(int m) {moons = m;} //number of moons
        int getMoons(){return moons;}
        public static int (String planets);
    }
    public void NumOfMoons(){
    }
    static CelestialObject celestialObject = new CelestialObject() {
        @Override
        public void displayCelestialObject() {
            System.out.println("Comet is a celestial object");
        }

    };
}
