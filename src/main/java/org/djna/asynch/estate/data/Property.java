package org.djna.asynch.estate.data;


import java.util.ArrayList;

public class Property {
    private int id;
    private String name;
    private String[] locationNames;
    private ArrayList<Location> locationList;
    public Property( int initId, String initName, String[] initLocationNames){
        id = initId;
        name = initName;
        locationNames = initLocationNames;
        locationList = addLocationsToList();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String[] getLocationNames() {
        return locationNames;
    }

    public ArrayList<Location> addLocationsToList() {
        ArrayList<Location> list = new ArrayList<Location>();
        for (String locationName : locationNames) {
            list.add(new Location(id, locationName, 20));
        }
        return list;
    }

    public ArrayList<Location> getLocationList() {
        return locationList;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}