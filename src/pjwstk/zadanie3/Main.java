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
public class Main {

    public static void main(String[] args) {
        Triangle triangle = new Triangle(10, 12, 10);
        System.out.println("Pole: " + triangle.getArea());
        System.out.println("Obwod: " + triangle.getPerimeter());
        System.out.println("Rownoboczny: " + triangle.isEquilateral());
        System.out.println("Rownoramienny: " + triangle.isIsosceles());
        System.out.println("Roznoboczny: " + triangle.isScalene());
    }

}
