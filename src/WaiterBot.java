import java.util.ArrayList;

public class WaiterBot {
    IMenu dinerMenu;
    IMenu pancakeHouseMenu;

    public WaiterBot(IMenu dinerMenu, IMenu pancakeHouseMenu) {
        this.dinerMenu = dinerMenu;
        this.pancakeHouseMenu = pancakeHouseMenu;
    }

    public void printMenu(){
        System.out.println("------------------------------------Breakfast Menu---------------------------------------");
        printBreakfastMenu();
        System.out.println("------------------------------------End of Breakfast Menu--------------------------------");


        System.out.println("----------------------------------------Lunch Menu---------------------------------------");
        printLunchMenu();
        System.out.println("------------------------------------End of Lunch Menu-----------------------------------");

        System.out.println("------------------------------------Vegetarian Menu-----------------------------------");
        vegetarianMenu();
        System.out.println("------------------------------------End of Vegetarian Menu-----------------------------------");
    }
    public void printBreakfastMenu(){
      IIterator pancakeIterator = pancakeHouseMenu.createIterator();
//        ArrayList breakfastItems = pancakeHouseMenu;
        while(pancakeIterator.hasNext()){
            MenuItem currItem = (MenuItem) pancakeIterator.next();
            System.out.println(currItem.getName());
        }
    }
    public void printLunchMenu(){
        IIterator dinerIterator = dinerMenu.createIterator();
        while (dinerIterator.hasNext()){
            MenuItem currItem = (MenuItem) dinerIterator.next();
            System.out.println(currItem.getName());
        }
    }

    public boolean isVegetarian(MenuItem menuItem){
        return menuItem.isVegetarian();
    }
    public void vegetarianMenu(){
        IIterator dinerIterator = dinerMenu.createIterator();
        IIterator pancakeIterator = pancakeHouseMenu.createIterator();
        while (dinerIterator.hasNext()){

            MenuItem currItem = (MenuItem) dinerIterator.next();
            if(currItem.isVegetarian()){
                System.out.println(currItem.getName());
            }
        }
        while(pancakeIterator.hasNext()){
            MenuItem currItem = (MenuItem) pancakeIterator.next();
            if(currItem.isVegetarian()){
                System.out.println(currItem.getName());
            }
        }
    }
}
