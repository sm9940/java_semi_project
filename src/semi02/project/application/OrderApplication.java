package semi02.project.application;

import semi02.project.restaurant.Customer;
import semi02.project.restaurant.DeliveryPacking;
import semi02.project.restaurant.Food;
import semi02.project.restaurant.Restaurant;
import semi02.project.restaurant.receipt.Receipt;
import semi02.project.utils.Define;

public class OrderApplication {
    Food beef;
    Food pork;
    Restaurant SM_RESTAURANT = Restaurant.getInstance();
    Receipt receipt =new Receipt();
    public static void main(String[] args) {
        OrderApplication app = new OrderApplication();
        app.createFood();
        app.createCustomer();
        String report = app.receipt.getReceipt() ;
        System.out.println(report);



    }
    public void createFood(){
        beef = new Food("beef",1001,Define.BEEF_PRICE);
        pork = new Food("pork",2001,Define.PORK_PRICE);
        SM_RESTAURANT.addFood(beef);
        SM_RESTAURANT.addFood(pork);
    }
    public void createCustomer(){
        DeliveryPacking delivery =new DeliveryPacking("delivery", Define.DEL_TYPE);
        DeliveryPacking packaging =new DeliveryPacking("packaging", Define.PACK_TYPE);
        Customer customer1 = new Customer("이승민",191912,beef,3,delivery);
        Customer customer2 = new Customer("오승찬",191913,beef,3,packaging);
        Customer customer3 = new Customer("이영광",191914,pork,4,delivery);
        Customer customer4 = new Customer("원상운",191915,pork,2,packaging);
        SM_RESTAURANT.addCustomer(customer1);
        SM_RESTAURANT.addCustomer(customer2);
        SM_RESTAURANT.addCustomer(customer3);
        SM_RESTAURANT.addCustomer(customer4);
        beef.register(customer1);
        beef.register(customer2);
        pork.register(customer3);
        pork.register(customer4);
        delivery.register(customer1);
        packaging.register(customer2);
        delivery.register(customer3);
        packaging.register(customer4);
        SM_RESTAURANT.addDeliveryPacking(delivery);
        SM_RESTAURANT.addDeliveryPacking(packaging);
    }

}
