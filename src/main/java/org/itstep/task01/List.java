package org.itstep.task01;

public class List {
    private Object[] obj;
    private int size = -1;
    private int cur = -1;

    public List(int size) {
        cur = 0;
        this.size = size;
        obj = new Object[size];
    }

    public Object get(int idx) {
        return obj[idx];
    }

    public void add(Object item) throws FullListException {


        if (this.cur == this.size) {
            throw new FullListException(this.cur);
        } else {
            obj[cur++] = item;
        }

    }

    public void removeLast() throws EmptyListException {
        if (this.cur == 0) {
            throw new EmptyListException();
        } else {
            obj[--cur] = null;
        }
    }
}

class ListException extends Exception {
}

class EmptyListException extends ListException {
    EmptyListException() {
    }

    @Override
    public String toString() {
        return "Массив не содержит элементов для удаления!";
    }
}

class FullListException extends Throwable {
    private int index;

    FullListException(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Индекс " + index + " выходит за диапазон массива";
    }
}

