package com.cgm.internship.springDemo.model;

public class Pants {
    private String size;
    private String color;
    private String madeIn;
    private String material;
    private String type;

    public Pants(String size, String color, String madeIn, String material, String type) {
        this.size = size;
        this.color = color;
        this.madeIn = madeIn;
        this.material = material;
        this.type = type;
    }

    public Pants() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMadeIn() {
        return madeIn;
    }

    public void setMadeIn(String madeIn) {
        this.madeIn = madeIn;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Pants details: " +
                "size: " + size +
                ", color: "  + color  +
                ", madeIn: " + madeIn  +
                ", material: " + material +
                ", type: " +type;
    }
}
