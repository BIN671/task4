package org.example;

public class Circle {
    private int r;

    public Circle(int r){
        if (r == 0){
            throw new RuntimeException("There is no figure with such parameters.");
        } else {
            this.r = r;
        }
    }

    public double area(){
        return Math.PI*(Math.pow(r, 2));
    }

    public double perimetr(){
        return 2*Math.PI*r;
    }

}
