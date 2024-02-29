package semi02.project.restaurant;

import semi02.project.utils.Define;

import java.util.ArrayList;

public class Food {
    protected String foodName;
    protected int foodId;

    protected int deliveryType;
   protected ArrayList<Customer>customerList = new ArrayList<>();

   public Food(String foodName, int foodId){
       this.foodName = foodName;
       this.foodId = foodId;
       this.deliveryType = Define.DEL_TYPE; //배달방식: 기본으로 배달 사용
   }
   public void register(Customer customer){
       customerList.add(customer);
   }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public int getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(int deliveryType) {
        this.deliveryType = deliveryType;
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(ArrayList<Customer> customerList) {
        this.customerList = customerList;
    }
}
