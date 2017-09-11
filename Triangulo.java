package org.eclipse.che.examples;

public class Triangulo implements Shape {
     private double base;
    private double height;
    
    public Triangulo (double base, double height){
        this.base = base;
        this.height = height;
        
    }
    public double getArea(){
        return this.base * this.height;
    }
    public String toString(){
        return "Triangulo [ base " + this.base 
        + " height " + this.height + 
        "area " + this.getArea() + " ]";
    }
}

