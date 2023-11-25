public class DVD extends Item {
    private int duration;

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
