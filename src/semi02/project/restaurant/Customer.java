package semi02.project.restaurant;

import java.util.ArrayList;

public class Customer {
    protected int CustomerId;
    protected String CustomerName;

    protected Food food;
    protected DeliveryPacking deliveryPacking;
protected ArrayList<Food>foodList = new ArrayList<>();
    public Customer(String CustomerName,int CustomerId,Food food,DeliveryPacking deliveryPacking){
        this.CustomerName = CustomerName;
        this.CustomerId = CustomerId;
        this.food =food;
        this.deliveryPacking = deliveryPacking;

    }



    @Override
    public String toString() {
        return   " 고객 이름: " + CustomerName + " 고객 ID: " + CustomerId + " 음식: " + food.getFoodName() + " 배달 방식:" + deliveryPacking.getDeliveryMethod() ;
    }

    public int getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(int customerId) {
        CustomerId = customerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public DeliveryPacking getDeliveryPacking() {
        return deliveryPacking;
    }

    public void setDeliveryPacking(DeliveryPacking deliveryPacking) {
        this.deliveryPacking = deliveryPacking;
    }
}
