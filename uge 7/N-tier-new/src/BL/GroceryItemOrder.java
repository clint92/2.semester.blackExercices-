package BL;

/**
 * Created by clint on 25-08-2016.
 */
public class GroceryItemOrder implements GroceryItemOrderInterface {
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

    @Override
    public double GetCost()
    {
        double total = 0;
        total = Quantity + Price;
        return total;
    }

    //////////////////////////////getters//////////////////////////

    @Override
    public String getItem()
    {
        return this.Item;
    }

    @Override
    public int getQuantity()
    {
        return this.Quantity;
    }

    @Override
    public double getPrice()
    {
        return this.Price;
    }

    @Override
    public double getCost() {return this.TotalPrice;}


    /////////////////////////////Setters//////////////////////////////

    @Override
    public void setItem(String item)
    {
        this.Item = item;
    }

    @Override
    public void setQuantity(int quantity)
    {
        this.Quantity = quantity;
    }

    @Override
    public void setPrice(double price)
    {
        this.Price = price;
    }


    ///////////////////////////////To String///////////////////////////////

    @Override
    public String toString()
    {
        String print = "Item: " + this.Item + ". quantity: " + this.Quantity + ". Total price: " + this.TotalPrice + "Kr.";

        return print;
    }
}
