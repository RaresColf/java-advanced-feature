package com.sda.rares.advanced.enums.ex1;

public enum Planet {

    JUPITER("big", "Jupiter",55547785L),
    SATURN("medium", "Saturn",4588752L),
    VENUS("medium", "Venus",78755L),
    MERCURY("small", "Mercury",4788893322L),
    TERRA("the best", "Terra",0L);

    private final String relativeSize;
    private final String displayName;

    private final Long distanceFromEarth;

    Planet(String relativeSize, String displayName, Long distanceFromEarth) {
        this.relativeSize = relativeSize;
        this.displayName = displayName;
        this.distanceFromEarth = distanceFromEarth;
    }

    public Long getDistanceFromEarth() {
        return distanceFromEarth;
    }

    @Override
    public String toString() {
        return relativeSize + " " + displayName;
    }
}