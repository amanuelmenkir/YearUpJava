package com.yearup.week2.homework;

import com.yearup.week2.homework.Planet;

public class SolarSystemPlanet extends Planet {

    private String Sun = "SUN";

    @Override
    public String getMyStar() {
        return this.getMyStar();
    }

    public int positionOfPlanet (String planets){
        if (planets == "Mercury"){
            return 1;
        }else if (planets == "Venus"){
            return 2;
        }else if (planets == "Earth"){
            return 3;
        }else if (planets == "Mars"){
            return 4;
        }else if (planets == "Jupiter"){
            return 5;
        }else if (planets == "Saturn"){
            return 6;
        }else if (planets == "Uranus"){
            return 7;
        }else if (planets == "Neptune"){
            return 8;
        }else return 0;
    }

}