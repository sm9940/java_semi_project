package semi02.project.application;

import semi02.project.restaurant.Customer;
import semi02.project.restaurant.DeliveryPacking;
import semi02.project.restaurant.Food;
import semi02.project.restaurant.Restaurant;
import semi02.project.utils.Define;

public class OrderApplication {
    Food beef;
    Food pork;
    Restaurant SM_CHINESE = Restaurant.getInstance();
    public static void main(String[] args) {
        OrderApplication app = new OrderApplication();
        app.createFood();
        app.createCustomer();
//        String report = ap ;



    }
    public void createFood(){
        beef = new Food("beef",1001);
        pork = new Food("pork",2001);
        SM_CHINESE.addFood(beef);
        SM_CHINESE.addFood(pork);
    }
    public void createCustomer(){
        DeliveryPacking delivery =new DeliveryPacking("delivery", Define.DEL_TYPE);
        DeliveryPacking packaging =new DeliveryPacking("packaging", Define.PACK_TYPE);
        Customer customer1 = new Customer("이승민",191912,beef,delivery);
        Customer customer2 = new Customer("오승찬",191913,pork,packaging);
        Customer customer3 = new Customer("이영광",191914,pork,delivery);
        Customer customer4 = new Customer("원상운",191915,pork,packaging);
        SM_CHINESE.addCustomer(customer1);
        SM_CHINESE.addCustomer(customer2);
        SM_CHINESE.addCustomer(customer3);
        SM_CHINESE.addCustomer(customer4);
        SM_CHINESE.addDeliveryPacking(delivery);
        SM_CHINESE.addDeliveryPacking(packaging);
    }

}
