package org.eclipse.che.examples;

public class Rectangulo implements Shape {
    private double width;
    private double lenght;
    
    public Rectangulo (double width, double lenght){
        this.width = width;
        this.lenght = lenght;
        
    }
    public double getArea(){
        return this.width * this.lenght;
    }
    public String toString(){
        return "Rectangulo [ width " + this.width 
        + " length " + this.lenght + 
        "area " + this.getArea() + " ]";
    }
    
    

    
    
    
}
