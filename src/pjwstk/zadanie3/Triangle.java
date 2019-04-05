/*
    Zadanie 3: Stworzenie klasy Triangle z metodami obliczeniowymi.
    Autor: Rafał Tęcza
    Index: s19468 
*/
package pjwstk.zadanie3;

/**
 *
 * @author s19468
 */
public class Triangle {
    
    private double a;
    private double b;
    private double c;
    
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
  
    public double getPerimeter() {
        return getA() + getB() + getC();
    }
    
    public double getArea() {
        double s = (getA() + getB() + getC()) / 2;
        s = s * (s - getA()) * (s - getB()) * (s - getC());
        return Math.sqrt(s);
    }
    
    public boolean isEquilateral() {
        return getA() == getB() && getA() == getC();
    }
    
    public boolean isIsosceles() {
        return getA() == getB() || getA() == getC() || getB() == getC();
    }
    
    public boolean isScalene() {
        return getA() != getB() && getB() != getC() && getA() != getC(); 
    }
    
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}