public class Library implements IManageable {
    private List<Item> items;
    private List<Patron> patrons;

    // Конструктор та інші методи

    @Override
    public void add(Item item) {
        items.add(item);
    }

    @Override
    public void remove(Item item) {
        items.remove(item);
    }

    @Override
    public void listAvailable() {
        for (Item item : items) {
            if (!item.isBorrowed()) {
                System.out.println("Available: " + item.getTitle());
            }
        }
    }

    @Override
    public void listBorrowed() {
        for (Item item : items) {
            if (item.isBorrowed()) {
                System.out.println("Borrowed: " + item.getTitle() + " by " + item.getBorrower().getName());
            }
        }
    }

    public void registerPatron(Patron patron) {
        patrons.add(patron);
    }

    public void lendItem(Patron patron, Item item) {
        if (!item.isBorrowed()) {
            item.borrowItem();
            patron.borrow(item);
        } else {
            System.out.println("Item already borrowed.");
        }
    }

    public void returnItem(Patron patron, Item item) {
        if (patron.getBorrowedItems().contains(item)) {
            item.returnItem();
            patron.returnItem(item);
        } else {
            System.out.println("This item is not borrowed by the patron.");
        }
    }
}
