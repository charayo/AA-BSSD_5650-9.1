public interface IMenu {
    void addItem(String name, String description, boolean vegetarian, double price);
    IIterator createIterator();
}
