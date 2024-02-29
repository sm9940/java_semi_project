package semi02.project.application;

import semi02.project.restaurant.Customer;
import semi02.project.restaurant.DeliveryPacking;
import semi02.project.restaurant.Food;
import semi02.project.restaurant.Restaurant;
import semi02.project.restaurant.receipt.Receipt;
import semi02.project.utils.Define;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class OrderApplication {
    private static OrderApplication instance;

    private Food beef;
    private Food pork;
    private Food chicken;
    private Restaurant SM_RESTAURANT = Restaurant.getInstance();
    private Receipt receipt = new Receipt();
    private Scanner scanner = new Scanner(System.in);

    private OrderApplication() {}

    public static OrderApplication getInstance() {
        if (instance == null) {
            instance = new OrderApplication();
        }
        return instance;
    }


    public static void main(String[] args) {
        OrderApplication.getInstance().run();
    }
    public void run() {
        boolean run = true;
        while (run) {
            String report = receipt.getReceipt();
            createFood();
            System.out.println("====================================================");
            System.out.println("1. 주문하기 | 2. 주문 고객 정보 | 3. 고객 이름으로 주문내역 검색 | 4.종료");
            System.out.println("====================================================");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    createCustomer();
                    break;
                case 2:
                    System.out.println(report);
                    break;
                case 3: findCustomer();
                break;
                case 4:
                    run = false;
                    break;
            }
        }
    }

    public void createFood() {
        if (beef == null) {
            beef = new Food("스테이크", 1001, Define.BEEF_PRICE);
            SM_RESTAURANT.addFood(beef);
        }
        if (pork == null) {
            pork = new Food("삼겹살구이", 2001, Define.PORK_PRICE);
            SM_RESTAURANT.addFood(pork);
        }
        if(chicken == null){
            chicken = new Food("전기통닭",3001,Define.CHICKEN_PRICE);
            SM_RESTAURANT.addFood(chicken);
        }
    }

    public void createCustomer() {
        DeliveryPacking delivery = new DeliveryPacking("배달", Define.DEL_TYPE);
        DeliveryPacking packaging = new DeliveryPacking("포장", Define.PACK_TYPE);
        SM_RESTAURANT.addDeliveryPacking(delivery);
        SM_RESTAURANT.addDeliveryPacking(packaging);

        System.out.println("고객 이름: ");
        String name = scanner.next();
        System.out.println("고객 ID : ");
        int id = scanner.nextInt();
        System.out.println("선택할 음식 | 스테이크 | 삼겹살구이 | 전기통닭 |");
        String choice = scanner.next();
       Food food= null;
       if(choice.equals(chicken.getFoodName())){food=chicken;}
       else if(choice.equals(pork.getFoodName())){food=pork;}
       else {food=beef;}
        System.out.println("음식 갯수: ");
        int number = scanner.nextInt();
        System.out.println("| 배달 | 포장 |");
        DeliveryPacking method = scanner.next().equals(delivery.getDeliveryMethod()) ? delivery : packaging;

        Customer customer1 = new Customer(name, id, food, number, method);
        if (food == beef) {
            beef.register(customer1);
        } else if(food==pork){
            pork.register(customer1);
        }else {chicken.register(customer1);}
        if (method == delivery) {
            delivery.register(customer1);
            SM_RESTAURANT.addCustomer(customer1);
            System.out.println("주문 완료 되었습니다");
        } else {
            packaging.register(customer1);
            SM_RESTAURANT.addCustomer(customer1);
            System.out.println("주문 완료 되었습니다");
        }
    }
        public void findCustomer(){
            System.out.println("고객명:");
            String findName = scanner.next();

            ArrayList<Customer>customerList = SM_RESTAURANT.getCustomerList();
            for (int i = 0 ; i <customerList.size();i++){
                Customer customer = customerList.get(i);
                if(customer.getCustomerName().equals(findName)){
                    System.out.println(customer);
                }

            }

        }
}
