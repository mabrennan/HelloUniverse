package com.caci.hellouniverse;

/**
 * Created by mabre on 8/12/2016.
 */
public class Galaxy {
    String galaxyName;
    int galaxySolarSystems;
    int galaxyPlanets;
    long galaxyColonies;
    double galaxyPopulation;
    int galaxyFleets;
    int galaxyStarships;

    public Galaxy(String name, int solarSys, int planets){

    galaxyName=name;
    galaxySolarSystems=solarSys;
    galaxyPlanets=planets;
    galaxyColonies=0;
    galaxyPopulation=0;
    galaxyFleets=0;
    galaxyStarships=0;
    }
    void setGalaxyColonies (long numberColonies){
        galaxyColonies=numberColonies;
    }
    void setGalaxyPopulation (double numberLifeforms){
        galaxyPopulation=numberLifeforms;
    }
    void setGalaxyFleets (int numberFleets){
        galaxyFleets=numberFleets;
    }
    void setGalaxyStarships (int numberStartship){
        galaxyStarships=numberStartship;
    }
        long getGalaxyColonies() {
        return galaxyColonies;
    }
    double getGalaxyPopulation() {
        return galaxyPopulation;
    }
    int getGalaxyFleets() {
        return galaxyFleets;
    }
    int getGalaxyStarships() {
        return galaxyStarships;
    }

}
