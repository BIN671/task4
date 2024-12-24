package org.example;

public class Rectangle {
    private int width;
    private int lenth;

    public Rectangle(int width, int lenth){
        if (width == 0 || lenth == 0){
            throw new RuntimeException("There is no figure with such parameters.");
        } else {
            this.lenth = lenth;
            this.width = width;
        }
    }

    public int area(){
        return lenth*width;
    }

    public int perimetr(){
        return (lenth+width)*2;
    }
}
