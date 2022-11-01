package org.itstep.task05;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException,RuntimeException {
        // TODO: проверяйте ваш код здесь
        Runner runner1 = new Runner();
        Runner runner2 = new Runner();
        Runner runner3 = new Runner();
        try {
            runner1.halt();
        } catch (IOException e){
            throw new IOException(); //выбрасываем IOException наверх
        } catch (RuntimeException a){ //выбрасываем перехватываем RuntimeException и печатаем halt
            System.out.println("halt");
        }

        try {
            runner2.halt();
        } catch (IOException e){
            throw new IOException();
        } catch (RuntimeException a){
            System.out.println("halt");
        }

        try {
            runner3.halt();
        } catch (IOException e){
            throw new IOException();
        } catch (RuntimeException a){
            System.out.println("halt");
        }

    }
}
