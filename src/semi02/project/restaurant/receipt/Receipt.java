package semi02.project.restaurant.receipt;

import semi02.project.Payment.DeliveryPay;
import semi02.project.Payment.PackagingPay;
import semi02.project.Payment.Payment;
import semi02.project.restaurant.Customer;
import semi02.project.restaurant.Food;
import semi02.project.restaurant.Restaurant;
import semi02.project.utils.Define;
import studentInfo.school.Student;

import java.util.ArrayList;

public class Receipt {
Restaurant restaurant = Restaurant.getInstance();
public static final String TITLE = "주문 현황 \t\t\n";
public static final String HEADER = "고객 이름| 고객ID | 음식 | 배달/포장 | 지불금액 \n";

public static final String LINE = "=====================================\n";

private StringBuffer buffer = new StringBuffer();

public String getReceipt(){
    ArrayList<Food>foodList = restaurant.getFoodList();
    for(Food food : foodList){
        makeHeader(food);
        makeBody(food);
        makeFooter();
    }
    return buffer.toString();
}

public void makeHeader(Food food){
    buffer.append(Receipt.LINE);
    buffer.append("\t"+Restaurant.getInstance().getRESTAURANT_NAME()+"\n");
    buffer.append(Receipt.LINE);
    buffer.append("\t"+food.getFoodName());
    buffer.append(Receipt.TITLE);
    buffer.append(Receipt.HEADER);
    buffer.append(Receipt.LINE);
}
public void makeBody(Food food){
    ArrayList<Customer>customerList = food.getCustomerList();

    for (Customer customer: customerList){

        buffer.append(customer.getCustomerName());
        buffer.append(" | ");
        buffer.append(customer.getCustomerId());
        buffer.append(" | ");
        buffer.append(customer.getFood().getFoodName()+"\t");
        buffer.append(" | ");
        buffer.append(customer.getDeliveryPacking().getDeliveryMethod());
        buffer.append(" | ");
        buffer.append(getPrice(customer));
        buffer.append("\n");
    }
}
public void makeFooter(){buffer.append("\n");};
public int getPrice(Customer customer) {
    ArrayList<Customer> customerList = customer
    int deliveryType = customer.getDeliveryPacking().getDeliveryType();
    Payment[] payments = {new DeliveryPay(), new PackagingPay()};
        int Price = 0;
    for (int i = 0; i < customerList.size(); i++) {
        Customer customer1 = customerList.get(i);
        if (deliveryType == Define.DEL_TYPE) {
            Price =  + payments[Define.DEL_TYPE].getPay();

        } else {
            Price =  + payments[Define.PACK_TYPE].getPay();

        }
        return Price;
    }
    return Price;
}
}
