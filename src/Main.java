import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cat[] catHouse = new Cat[10];

        Random random = new Random();

        // создание котов и присвоение им имени с добавлением рандома для получения разных имён для шерстяных
        for (int i = 0; i < catHouse.length; i++) {
            catHouse[i] = new Cat();
            catHouse[i].setName(i + " Bob-" + ((i+1)* random.nextInt(999999)));
        }

        //принтер
        for (int i = 0; i < catHouse.length; i++) {
            System.out.println(catHouse[i].getName());
        }
        System.out.printf("\n\n\n\n");

        // сортировка Котов которая не работает
        Cat tempCat = new Cat();
        boolean sorted = false;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < catHouse.length - 1; i++) {
                int a = catHouse[i].getName().compareTo(catHouse[i+1].getName());

                if (a<=0) {

                    continue;
                }
                if (a>0){
                    tempCat = catHouse[i];
                    catHouse[i] = catHouse[i+1];
                    catHouse[i+1] = tempCat;
                    sorted = false;
                }
            }
        }

        // принтер
        for (int i = 0; i < catHouse.length; i++) {
            System.out.println(catHouse[i].getName());
        }

//
//           if (a<0){


    }
}
