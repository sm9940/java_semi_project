package semi02.project.restaurant;

import semi02.project.utils.Define;

import java.util.ArrayList;

public class Customer {
    protected int CustomerId; //고객 ID;
    protected String CustomerName; //고객 이름

    protected Food food; //음식
    protected DeliveryPacking deliveryPacking; //배달 방식
    protected int number; //
ArrayList<Pay>payList = new ArrayList<>();
protected ArrayList<Food>foodList = new ArrayList<>();
    public Customer(String CustomerName,int CustomerId,Food food,int number,DeliveryPacking deliveryPacking){
        this.CustomerName = CustomerName;
        this.CustomerId = CustomerId;
        this.food = food;
        this.number= number;
        this.deliveryPacking = deliveryPacking;


    }

    public ArrayList<Food> getFoodList() {
        return foodList;
    }

public int calc(){
        int Price;
        if(food.getFoodId()==Define.BEEF){
            Price = Define.BEEF_PRICE*number;
        } else {
            Price =Define.PORK_PRICE*number;
        }
        return Price;
}


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return   " 고객 이름: " + CustomerName + " 고객 ID: " + CustomerId + " 음식: " + food.getFoodName() + " 배달 방식:" + deliveryPacking.getDeliveryMethod() +" 음식 갯수: "+ number+"인분" ;
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
