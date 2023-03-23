public class DinerMenuIterator implements IIterator{
    //hold a reference to the collection we iterate
    MenuItem[] menuItems;
    int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
       if(position >= menuItems.length || menuItems[position] == null){
           return false;

       }else{
           return true;
       }
    }

    @Override
    public Object next() {
        MenuItem menuItem =  menuItems[position];
        position++;
        return menuItem;
    }
}
