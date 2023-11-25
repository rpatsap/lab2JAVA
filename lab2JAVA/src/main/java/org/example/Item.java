public abstract class Item {
    private String title;
    private String uniqueID;
    private boolean isBorrowed;

    // Конструктор, гетери та сетери

    public abstract void borrowItem(); // Абстрактний метод для позначення предмета як взятого напрокат
    public abstract void returnItem(); // Абстрактний метод для повернення предмета в бібліотеку
}
