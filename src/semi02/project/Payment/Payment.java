package semi02.project.Payment;

import semi02.project.restaurant.DeliveryPacking;

public interface Payment {
    String getPay(DeliveryPacking deliveryPacking);
}
