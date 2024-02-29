package semi02.project.restaurant;

public class DeliveryPacking {
    protected DeliveryPacking deliveryPacking;
protected String deliveryMethod;
    protected int deliveryType;

public DeliveryPacking(String deliveryMethod, int deliveryType){
    this.deliveryMethod = deliveryMethod;
    this.deliveryType = deliveryType;
}

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public int getDeliveryType() {
        return deliveryType;
    }
}
