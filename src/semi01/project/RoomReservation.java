package semi01.project;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomReservation {

  protected String Name; //예약자명
    protected int ReservationDay; //예약일수
     public String Room; //예약할 룸
   protected int People; //인원
public int Price;
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getReservationDay() {
        return ReservationDay;
    }

    public void setReservationDay(int reservationDay) {
        ReservationDay = reservationDay;
    }

    public String getRoom() {
        return Room;
    }

    public void setRoom(String room) {
        Room = room;
    }

    public int getPeople() {
        return People;
    }

    public void setPeople(int people) {
        People = people;
    }

    public RoomReservation(String name,int day,String room,int people) {
        init();

    }

    public void init(){
        Room = "single";
        Price = 100000;
        People = 1;
    }
    public int calcPrice(){
        return Price*ReservationDay;
    }
    public String showCustomerInfo(){
        return Name+Price+People;
    }
    public String showRoomInfo(){
        return Room + Price +People ;
    }
}
