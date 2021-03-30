import java.util.*;

public class App {
    /** Задание 1
     Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и
     вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
     Посчитать, сколько раз встречается каждое слово.
     */
    /** Задание 2
     * Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и
     * телефонных номеров. В этот телефонный справочник с помощью метода add() можно
     * добавлять записи, а с помощью метода get() искать номер телефона по фамилии. Следует
     * учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
     * тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не
     * добавлять лишний функционал (дополнительные поля (имя, отчество, адрес), взаимодействие с
     * пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки
     * телефонного справочника.
     */
    public static void main(String[] args) {
        //Задание № 1
        ArrayFilter<String> alphabet = new ArrayFilter<>(Arrays.asList("Z","A", "D", "B", "D", "I", "W", "F",
                "B", "D", "L", "Q", "C", "M", "H", "N", "M", "H", "G", "N", "N"));


        alphabet.info();
        alphabet.uniqueElements();
        alphabet.numberAllElements();

        System.out.println();

        //Задание № 2

        Phone phone1 = new Phone();
        phone1.setName("Иванов");
        phone1.setNumber("66-77-88");

        Phone phone2 = new Phone();
        phone2.setName("Иванов");
        phone2.setNumber("44-55-66");

        Phone phone3 = new Phone();
        phone3.setName("Петров");
        phone3.setNumber("55-66-77");

        Phone phone4 = new Phone();
        phone4.setName("Сидоров");
        phone4.setNumber("11-33-99");


        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(phone1);
        phoneBook.add(phone2);
        phoneBook.add(phone3);
        phoneBook.add(phone4);

        phoneBook.info();

        phoneBook.get("Иванов");
        phoneBook.get("Петров");
        phoneBook.get("Сидоров");


    }
}
