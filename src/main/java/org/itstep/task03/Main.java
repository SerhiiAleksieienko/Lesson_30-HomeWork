package org.itstep.task03;

public class Main {
    public static void main(String[] args) throws CreateTriangleException {
        //TODO: проверяйте ваш код здесь
        try {
            Triangle triangle1=new Triangle(3,4,5);
        } catch (CreateTriangleException e){
            System.err.println(e);
        }

        try {
            Triangle triangle2=new Triangle(10,4,5);
        } catch (CreateTriangleException e){
            System.err.println(e);
        }

        try {
            Triangle triangle3=new Triangle(10,4,5);
        } catch (CreateTriangleException e){
            System.err.println(e);
        }

    }
}
class Triangle {
    //стороны треугольника:
    private final int a;
    private final int b;
    private final int c;

    public Triangle(int a, int b, int c) throws CreateTriangleException {

        //проверка возможности создать треугольник
        //Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
        if ((a+b)>c&&(a+c)>b&&(c+b)>a){
            this.a = a;
            this.b = b;
            this.c = c;
            System.out.println("Треугольник со сторонами "+this.a+", "+this.b+", "+c+" создан.");
        } else {
            throw new CreateTriangleException(a,b,c);
        }

    }
}



/**
 * Проверка возможности создать треугольник.
 * Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
 * Принимает аргументы - стороны треугольника.
 */
class CreateTriangleException extends Exception {

    //стороны треугольника:
    private int a;
    private int b;
    private int c;
    public CreateTriangleException(int a,int b,int c) {
        this.a=a;
        this.b=b;
        this.c=c;

    }

    @Override
    public String toString() {
        return "Треугольник со сторонами "+this.a+" "+this.b+" "+this.c+" не существует.";
    }
}
