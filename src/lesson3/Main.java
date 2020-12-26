package lesson3;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] strongAlcohol = {"Водка", "Ром", "Текила", "Водка", "Самогон", "Виски", "Коньяк", "Водка", "Коньяк", "Аппцент", "Спирт"};
        HashMap<String, Integer> strongAlcohols = new HashMap<>();
        for (String x : strongAlcohol) {
            strongAlcohols.put(x, strongAlcohols.getOrDefault(x,0)+1);
        }
        System.out.println(strongAlcohols);

        Phonebook book = new Phonebook();
        book.addContact("Иванов", "88001234567");
        book.addContact("Петров", "88001234765");
        book.addContact("Сидоров", "88007654321");
        book.addContact("Иванов", "88001245519");
        book.addContact("Медведев", "88005555555");
        book.addContact("Медведев", "88001654707");

        book.findAndPrint("Иванов");
        book.findAndPrint("Медведев");
        book.findAndPrint("Сидоров");
        book.findAndPrint("Петров");

    }
}
