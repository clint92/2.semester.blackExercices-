package BL;

/**
 * Created by clint on 16-11-2016.
 */
public interface GroceryItemOrderInterface {
    double GetCost();

    String getItem();

    int getQuantity();

    double getPrice();

    double getCost();

    void setItem(String item);

    void setQuantity(int quantity);

    void setPrice(double price);

    String toString();
}
