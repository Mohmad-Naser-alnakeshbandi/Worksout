package com.mohamadnaser.backend.model;

import java.util.ArrayList;
import java.util.Objects;

public class Workout {
    public String bodyPart;
    public String equipment;
    public String gifUrl;
    public String id;
    public String name;
    public String target;
    public ArrayList<String> secondaryMuscles;
    public ArrayList<String> instructions;

    public String getBodyPart() {
        return bodyPart;
    }

    public void setBodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public String getGifUrl() {
        return gifUrl;
    }

    public void setGifUrl(String gifUrl) {
        this.gifUrl = gifUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public ArrayList<String> getSecondaryMuscles() {
        return secondaryMuscles;
    }

    public void setSecondaryMuscles(ArrayList<String> secondaryMuscles) {
        this.secondaryMuscles = secondaryMuscles;
    }

    public ArrayList<String> getInstructions() {
        return instructions;
    }

    public void setInstructions(ArrayList<String> instructions) {
        this.instructions = instructions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Workout worksout)) return false;
        return Objects.equals(getBodyPart(), worksout.getBodyPart()) && Objects.equals(getEquipment(), worksout.getEquipment()) && Objects.equals(getGifUrl(), worksout.getGifUrl()) && Objects.equals(getId(), worksout.getId()) && Objects.equals(getName(), worksout.getName()) && Objects.equals(getTarget(), worksout.getTarget()) && Objects.equals(getSecondaryMuscles(), worksout.getSecondaryMuscles()) && Objects.equals(getInstructions(), worksout.getInstructions());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBodyPart(), getEquipment(), getGifUrl(), getId(), getName(), getTarget(), getSecondaryMuscles(), getInstructions());
    }

    @Override
    public String toString() {
        return "Worksout{" +
                "bodyPart='" + bodyPart + '\'' +
                ", equipment='" + equipment + '\'' +
                ", gifUrl='" + gifUrl + '\'' +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", target='" + target + '\'' +
                ", secondaryMuscles=" + secondaryMuscles +
                ", instructions=" + instructions +
                '}';
    }
}
