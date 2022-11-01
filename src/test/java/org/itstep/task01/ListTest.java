package org.itstep.task01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class ListTest {
    @Test
    void fullListException() throws FullListException {
        List list1 = new List(2);
        list1.add("wseftwfg");
        list1.add("wseftwfg");

        Assertions.assertThrows(FullListException.class, new Executable() {
            @Override
            public void execute() throws FullListException {

                list1.add("wseftwfg");
            }
        });
    }
    @Test
    void emptyListException() throws EmptyListException {
        List list2 = new List(0);


        Assertions.assertThrows(EmptyListException.class, new Executable() {
            @Override
            public void execute() throws EmptyListException {
                list2.removeLast();
            }
        });
    }
}
