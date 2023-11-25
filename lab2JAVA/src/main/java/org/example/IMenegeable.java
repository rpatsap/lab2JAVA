public interface IManageable {
    void add(Item item); // Додавання предмета до бібліотеки
    void remove(Item item); // Видалення предмета з бібліотеки
    void listAvailable(); // Список доступних предметів
    void listBorrowed(); // Список взятих предметів та їх читачів

    // Додавання методів, що характеризують унікальні функціональні можливості
    void registerPatron(Patron patron);
    void lendItem(Patron patron, Item item);
    void returnItem(Patron patron, Item item);
}
