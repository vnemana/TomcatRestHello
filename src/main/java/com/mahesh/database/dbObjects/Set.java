package com.mahesh.database.dbObjects;

/**
 * Created by mahesh on 5/29/17.
 */
public class Set {
    public enum Unit {
        POUNDS ("LB"), KILOGRAMS ("KG");
        private String unit;
        Unit (String unit) {
            this.unit = unit;
        }
        @Override
        public String toString() {
            return unit;
        }
    }

    int idVisit;
    int idExercise;
    float weight;
    Unit unit;
    int reps;
    int setNumber;

    public int getIdVisit() {
        return idVisit;
    }

    public void setIdVisit(int idVisit) {
        this.idVisit = idVisit;
    }

    public int getIdExercise() {
        return idExercise;
    }

    public void setIdExercise(int idExercise) {
        this.idExercise = idExercise;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getSetNumber() {
        return setNumber;
    }

    public void setSetNumber(int setNumber) {
        this.setNumber = setNumber;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }
}
