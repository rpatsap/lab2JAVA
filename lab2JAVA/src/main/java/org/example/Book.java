public class Book extends Item {
    private String author;

    // Конструктор, гетери та сетери

    @Override
    public void borrowItem() {
        this.setBorrowed(true);
    }

    @Override
    public void returnItem() {
        this.setBorrowed(false);
    }
}
