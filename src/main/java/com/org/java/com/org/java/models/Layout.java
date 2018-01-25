package com.org.java.com.org.java.models;

import java.util.List;

/**
 * Created by Bhargav on 1/22/2018.
 */
public class Layout {

    private int totalNumberOfSeats;

    private int Availability;

    private List<Section> sections;

    /** Getters and Setters for Layout class**/
    public int getTotalNumberOfSeats() { return totalNumberOfSeats; }

    public void setTotalNumberOfSeats(int totalNumberOfSeats) {
        this.totalNumberOfSeats = totalNumberOfSeats;
    }

    public int getAvailability() {
        return Availability;
    }

    public void setAvailability(int availability) {
        Availability = availability;
    }

    public List<Section> getSections() {
        return sections;
    }

    public void setSections(List<Section> sections) {
        this.sections = sections;
    }

    @Override
    public String toString() {
        return "Layout{" +
                "totalNumberOfSeats=" + totalNumberOfSeats +
                ", Availability=" + Availability +
                ", sections=" + sections +
                '}';
    }

}
