package org.itstep.task02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.itstep.task02.Main.getPositiveLessHundredNumber;


public class Main02Test {
    @Test
    void negativeNumberException() throws NegativeNumberException {
        Assertions.assertThrows(NegativeNumberException.class, new Executable() {
            @Override
            public void execute() throws NegativeNumberException {
                getPositiveLessHundredNumber(-1);
            }
        });
    }
    @Test
    void greatHundredException() throws GreatHundredException {
        Assertions.assertThrows(GreatHundredException.class, new Executable() {
            @Override
            public void execute() throws GreatHundredException, NegativeNumberException {
                getPositiveLessHundredNumber(150);
            }
        });
    }
}
