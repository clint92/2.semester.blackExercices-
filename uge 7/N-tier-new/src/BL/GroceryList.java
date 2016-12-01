package BL;

/**
 * Created by clint on 13-11-2016.
 */
public class GroceryList {
    private GroceryItemOrder[] List = new GroceryItemOrder[10];
    private int boks = 0;

    public void add(GroceryItemOrder item)

    {
        List[boks] = item;
        this.boks++;
    }

    public void GetTotalCost()

    {
        int ArraySize = List.length;
        double totalPrice = 0;
        System.out.println("Items:" + "\n");
        for(int i = 0; i < ArraySize; i++)
        {
            if(List[i] == null)
            {
                break;
            }
            System.out.println(List[i]);
            totalPrice += List[i].getCost();

        }
        System.out.printf("Total: " + totalPrice + " Kr.");
        System.out.println();
    }





    ////////////////////////////////to String///////////////////////////////////
    public String toString()
    {
        String output = "";
        for(int i = 0; i < boks; i++)
        {
            output += List[i].getItem() + " " + List[i].getQuantity() + " " + List[i].getCost() + " Kr.\n";
        }

        return output;
    }
}
