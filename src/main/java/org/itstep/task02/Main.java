package org.itstep.task02;


public class Main {
    public static void main(String[] args) throws NegativeNumberException {
        // TODO: проверяйте ваш код здесь
        try {
            getPositiveLessHundredNumber(1);
        } catch (NegativeNumberException | GreatHundredException e) { //перехват одного из Exceptions
            System.err.println(e);
        }

        try {
            getPositiveLessHundredNumber(-5);
        } catch (NegativeNumberException | GreatHundredException e) {
            System.err.println(e);
        }
        try {
            getPositiveLessHundredNumber(2);
        } catch (NegativeNumberException | GreatHundredException e) {
            System.err.println(e);
        }
        try {
            getPositiveLessHundredNumber(150);
        } catch (NegativeNumberException | GreatHundredException e) {
            System.err.println(e);
        }
        try {
            getPositiveLessHundredNumber(3);
        } catch (NegativeNumberException | GreatHundredException e) {
            System.err.println(e);
        }


    }

    public static void getPositiveLessHundredNumber(int i) throws NegativeNumberException {

        if (i < 0) {
            throw new NegativeNumberException(i);
        }
        if (i > 100) {
            throw new GreatHundredException(i);
        }
        System.out.println("i = " + i);
    }
}

class NegativeNumberException extends Exception { // если extends Exception, то исключение будет обязательное к перехвату
    private int i;
    NegativeNumberException(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Вводимое число "+i+" меньше нуля!";
    }
}

class GreatHundredException extends RuntimeException {  // если extends RuntimeException, то исключение будет обязательное к перехвату
    private int i;
    GreatHundredException(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return "Вводимое число "+i+" больше 100!";
    }
}
