/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.meganrobb.designprinciples.polymorphisim;

/**
 *
 * @author student
 */
public class Shipping implements QshoesPoly{
    private String style;
    private int size;
    private String color;
    private float cost;
    private double payment;

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
    //payment price that company owes shipping company
    public double prices (double costs){
        payment = (costs * 0.10) + costs;
        return payment;
    }
    
    
}
