package org.djna.asynch.estate.data;

public class Location {
    private int propertyId;
    private String location;
    private int initialTemp;

    public Location(int propertyId, String location, int initialTemp) {
        this.location = location;
        this.propertyId = propertyId;
    }

    public String getLocation() {
        return location;
    }

    public int getInitialTemp() {
        return initialTemp;
    }

    public int getPropertyId() {
        return propertyId;
    }
}
