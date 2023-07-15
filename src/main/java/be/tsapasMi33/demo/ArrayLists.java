package be.tsapasMi33.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

record GroceryItem(String name, String type, int count){

    public GroceryItem(String name) {
        this(name, "DAIRY", 1);
    }

    @Override
    public String toString() {
        return String.format("%d %s in %s", count, name, type);
    }
}

public class ArrayLists {
    public static void main(String[] args) {

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter"));
        groceryList.add(new GroceryItem("Yogurt"));
        groceryList.add(new GroceryItem("Milk"));
        groceryList.add(new GroceryItem("Orange", "FRUIT", 5));
        groceryList.add(0, new GroceryItem("Apple", "FRUIT", 5));

        System.out.println(groceryList);

        groceryList.set(0,new GroceryItem("Egg"));

        System.out.println(groceryList);

        groceryList.remove(0);

        System.out.println(groceryList);

        String[] items = {"apples", "bananas", "milk", "eggs"};
        List<String> list = List.of(items);

        System.out.println(list);
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("Third item = " + groceries.get(2));

        if (groceries.contains("mustard")) {
            System.out.println("Mustard is in the list");
        }

        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("cheese");
        System.out.println(groceries);

        groceries.removeAll(List.of("apples", "eggs"));
        System.out.println(groceries);

        groceries.retainAll(List.of("yogurt", "mustard"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());

        groceries.addAll(List.of( "milk", "mustard", "cheese"));
        groceries.addAll(Arrays.asList("eggs", "pickles", "mustard", "ham"));

        System.out.println(groceries);

        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);

        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[groceries.size()]);
        System.out.println(Arrays.toString(groceryArray));
    }
}
