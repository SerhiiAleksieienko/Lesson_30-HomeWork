package org.itstep.task01;

public class Main {
    public static void main(String[] args) throws FullListException, EmptyListException {
        // TODO: проверяйте ваш код здесь
        List list = new List(2);
        try {
            list.add("Volvo");
            list.add("Mazda");
            list.add("BMW");
        } catch (FullListException e) {
            System.err.println(e);
        }


        try {
            list.removeLast();
            list.removeLast();
            list.removeLast();
            list.removeLast();
        } catch (EmptyListException a) {
            System.err.println(a);
        }



        System.out.println("End of program");
    }
}
