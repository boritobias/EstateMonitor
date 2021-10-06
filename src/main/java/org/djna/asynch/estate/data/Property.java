package org.djna.asynch.estate.data;


public class Property {
    private int id;
    private String name;
    public Property( int initId, String initName){
        id = initId;
        name = initName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Property{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}