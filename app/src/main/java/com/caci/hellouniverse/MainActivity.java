package com.caci.hellouniverse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Galaxy milkyWay = new Galaxy("Milky Way", 511, 97);
    TextView nameData;
    TextView solarData;
    TextView habitData;
    TextView colonyData;
    TextView popData;
    TextView fleetData;
    TextView shipsData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createDefaultGalaxy();
        createUiTextViews();
        transferDataValues();
                    }

    private void transferDataValues() {
        nameData.setText(milkyWay.galaxyName);
        solarData.setText(String.valueOf(milkyWay.galaxySolarSystems));
        habitData.setText(String.valueOf(milkyWay.galaxyPlanets));
        colonyData.setText(String.valueOf(milkyWay.galaxyColonies));
        popData.setText(String.valueOf(milkyWay.galaxyPopulation));
        fleetData.setText(String.valueOf(milkyWay.galaxyFleets));
        shipsData.setText(String.valueOf(milkyWay.galaxyStarships));
    }

    private void createUiTextViews() {
        nameData = (TextView)findViewById(R.id.name);
        solarData = (TextView)findViewById(R.id.solar);
        habitData = (TextView)findViewById(R.id.habit);
        colonyData = (TextView)findViewById(R.id.colony);
        popData = (TextView)findViewById(R.id.pop);
        fleetData = (TextView)findViewById(R.id.fleet);
        shipsData = (TextView)findViewById(R.id.ships);

    }

    private void createDefaultGalaxy(){
        milkyWay.setGalaxyColonies(37579321);
        milkyWay.setGalaxyFleets(237);
        milkyWay.setGalaxyPopulation(1967387132);
        milkyWay.setGalaxyStarships(34769);
    }
}
