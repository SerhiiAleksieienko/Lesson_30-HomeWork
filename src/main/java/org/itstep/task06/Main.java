package org.itstep.task06;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemAlreadyExistsException;

public class Main {
    public static void main(String[] args) throws IOException {
        // TODO: проверяйте ваш код здесь
        XmlReader[] readers = new XmlReader[5];
        for (int i=0; i<readers.length; i++){
            readers[i]=new XmlReader();
        }
        Main.readXml(readers);


    }

    public static void readXml(XmlReader[] readers) throws IOException {
        for (XmlReader reader : readers) {
            try {
                reader.read();
            } catch (FileSystemAlreadyExistsException e) { //если возникает это исключение, то наверх выбрасывается FileNotFoundException
//                System.out.println(e); //для проверки
                throw new FileNotFoundException();
            } catch (FileNotFoundException | NullPointerException | Error e) { //эти исключения перехватываются и просто печатаются в консоль
                System.out.println(e);
            }

        }
    }
}
