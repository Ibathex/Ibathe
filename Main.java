package org.eclipse.che.examples;

public class HelloWorld {
    public static void main(String... argvs) {
        Shape a1, b1, c1;
        
        a1 = new Rectangulo(10,10);
        System.out.println(a1.toString());
        b1 = new Triangulo(10,4);
        System.out.println(b1.toString());
        c1 = new Rectangulo(5,6);
        System.out.println(c1.toString());
        
    }
}
