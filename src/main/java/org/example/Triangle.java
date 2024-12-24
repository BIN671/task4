package org.example;

public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c){
        if (a == 0 || b == 0 || c == 0){
            throw new RuntimeException("There is no figure with such parameters.");
        } else {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public double area(){
        double p2 = (double)(a+b+c)/2;
        return Math.sqrt(p2*(p2-a)*(p2-b)*(p2-c));
    }

    public int perimetr(){
        return a+b+c;
    }
}
