package semi02.project.restaurant;

import java.util.ArrayList;

public class DeliveryPacking {
    protected DeliveryPacking deliveryPacking;
protected String deliveryMethod;
    protected int deliveryType;
    ArrayList<Customer>customerList= new ArrayList<>();

public DeliveryPacking(String deliveryMethod, int deliveryType){
    this.deliveryMethod = deliveryMethod;
    this.deliveryType = deliveryType;
}

public void register(Customer customer){customerList.add(customer);}
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public int getDeliveryType() {
        return deliveryType;
    }
}
