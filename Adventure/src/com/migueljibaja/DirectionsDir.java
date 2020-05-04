package com.migueljibaja;

import java.util.HashMap;
import java.util.Map;

public class DirectionsDir {
    private final Map<String, String> directions;

    public DirectionsDir() {
        this.directions = new HashMap<String,String>();
    }

    public void addDirection(String humanWords, String direction) {
        directions.put(humanWords,direction);
    }

    public String traduce(String humanWords) {
        String[] aTraducir = humanWords.split(" ");
        for (String word : aTraducir) {
            if (this.directions.containsKey(word)) {
                return this.directions.get(word);
            }
        }
        return null;

    }

    public Map<String, String> getDirections() {
        return directions;
    }
}
