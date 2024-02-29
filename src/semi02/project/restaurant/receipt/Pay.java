package semi02.project.restaurant.receipt;

import semi02.project.restaurant.Customer;

import java.util.ArrayList;

public class Pay {
    protected int number;
    ArrayList<Pay> payList = new ArrayList<>();
    ArrayList<Customer>customerList = new ArrayList<>();
    public Pay(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public ArrayList<Pay> getPayList() {
        return payList;
    }

    public void setPayList(ArrayList<Pay> payList) {
        this.payList = payList;
    }
}
