package com.migueljibaja;

import java.util.HashMap;
import java.util.Map;

public class location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public location(int locationID, String description, Map<String) {
        this.locationID = locationID;
        this.description = description;
        this.exits = new HashMap<String, Integer>();
    }

    public void addExit(String direction, int location){
        exits.put(direction,location);
    }
    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        return exits;
    }
}
