package com.tr.task03.appliance.bean;

import java.util.Objects;

public class Speakers extends Appliance{

    private int powerConsumption;
    private int numberOfSpeakers;
    private int FrequencyRange;
    private double cordLength;

    public Speakers() {

    }

    public Speakers(int id, String category, double price, int powerConsumption, int numberOfSpeakers, int frequencyRange, double cordLength) {
        super(id, category, price);
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.FrequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public int getFrequencyRange() {
        return FrequencyRange;
    }

    public void setFrequencyRange(int frequencyRange) {
        FrequencyRange = frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Speakers speakers = (Speakers) o;
        return powerConsumption == speakers.powerConsumption && numberOfSpeakers == speakers.numberOfSpeakers && FrequencyRange == speakers.FrequencyRange && Double.compare(speakers.cordLength, cordLength) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), powerConsumption, numberOfSpeakers, FrequencyRange, cordLength);
    }

    @Override
    public String toString() {
        return super.toString() +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", FrequencyRange=" + FrequencyRange +
                ", cordLength=" + cordLength;
    }
}

