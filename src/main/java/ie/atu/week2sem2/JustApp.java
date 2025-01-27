package ie.atu.week2sem2;

import java.util.ArrayList;

public class JustApp {
    public static void main(String[] args) {

        ArrayList<Food> items= new ArrayList<>();
        double totalCost =0;
        System.out.println("Welcome to JustApp");
        System.out.println("This is your order...");
        //Create an order
        Burger cheeseBurger=new Burger("CheeseBurger", 1.99,"Tasty");
        Burger veggie=new Burger("VeggieBurger", 2.99,"Not Tasty");

        Pizza tuna= new Pizza("Tuna",8.99,"Nasty");

        Fries curry=new Fries("CurryFries",2.99,"Decent");

        Dessert brownie=new Dessert("ChocolateBrownie",3.00,"delicious");

        //List all of food items ie burgers,pizzas,fries
        items.add(cheeseBurger);
        items.add(veggie);
        items.add(tuna);
        items.add(curry);
        items.add(brownie);
        //Display details to the user
        for(Food item:items)
        {
            System.out.println(item.getName());
            System.out.println(item.getDescription());
            System.out.println(item.getPrice());
            totalCost +=item.getPrice();

        }
        System.out.println("Total costs: "+totalCost);
    }
}
