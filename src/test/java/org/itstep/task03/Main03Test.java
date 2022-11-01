package org.itstep.task03;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class Main03Test {

    @Test
    void createTriangleException1() throws CreateTriangleException{
        Assertions.assertThrows(CreateTriangleException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Triangle triangleTest = new Triangle(1,2,4);
            }
        });
    }
    @Test
    void createTriangleException2() throws CreateTriangleException{
        Assertions.assertThrows(CreateTriangleException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Triangle triangleTest = new Triangle(4,2,1);
            }
        });
    }
    @Test
    void createTriangleException3() throws CreateTriangleException{
        Assertions.assertThrows(CreateTriangleException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                Triangle triangleTest = new Triangle(1,4,2);
            }
        });
    }
}
