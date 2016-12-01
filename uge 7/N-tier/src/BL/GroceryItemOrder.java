package BL;

/**
 * Created by clint on 18-10-2016.
 */
public class GroceryItemOrder {
    private String Item;
    private int Quantity;
    private double Price = 0;
    private double TotalPrice;

    public GroceryItemOrder(String Item){
        this.Item = Item;
        this.Quantity = 1;
        this.Price = 0;
        this.TotalPrice = 0;

    }

    public GroceryItemOrder(String Item, int Quantity, double Price) {
        this.Item = Item;
        this.Quantity = Quantity;
        this.Price = Price;
        this.TotalPrice = Quantity * Price;
    }

    public double GetCost()
    {
        double total = 0;
        total = Quantity + Price;
        return total;
    }


    //////////////////////////////getters//////////////////////////

    public String getItem()
    {
        return this.Item;
    }

    public int getQuantity()
    {
        return this.Quantity;
    }

    public double getPrice()
    {
        return this.Price;
    }

    public double getCost() {return this.TotalPrice;}


    /////////////////////////////Setters//////////////////////////////

    public void setItem(String item)
    {
        this.Item = item;
    }

    public void setQuantity(int quantity)
    {
        this.Quantity = quantity;
    }

    public void setPrice(double price)
    {
        this.Price = price;
    }


    ///////////////////////////////To String///////////////////////////////

    public String toString()
    {
        String print = "Item: " + this.Item + ". quantity: " + this.Quantity + ". Total price: " + this.TotalPrice + "Kr.";

        return print;
    }
}
