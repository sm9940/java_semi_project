package semi02.project.restaurant;

import java.util.ArrayList;

public class Restaurant {
    private String RESTAURANT_NAME = "SM CHINESE";
    private static Restaurant instance = null;
    protected ArrayList<Customer> customerList = new ArrayList<>();
    protected ArrayList<Food>foodList = new ArrayList<>();
    protected ArrayList<DeliveryPacking>deliveryPackingList = new ArrayList<>();
    private Restaurant(){}

    public static Restaurant getInstance() {
        if(instance==null){
            instance = new Restaurant();
        }
        return instance;
    }
    public void addFood(Food food){
        foodList.add(food);
    }
    public void addCustomer(Customer customer){
        customerList.add(customer);
    }
    public void addDeliveryPacking(DeliveryPacking deliveryPacking){
        deliveryPackingList.add(deliveryPacking);
    }
}
