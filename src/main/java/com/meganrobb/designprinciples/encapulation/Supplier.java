/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meganrobb.designprinciples.encapulation;

/**
 *
 * @author student
 */
public class Supplier {

    private String style;
    private int size;
    private String color;
    private float cost;

    public String getStyle() {
        return style;
    }
    
    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;

    }

    public float getCost() {
        return cost;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }
}
