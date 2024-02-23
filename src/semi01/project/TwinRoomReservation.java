package semi01.project;

public class TwinRoomReservation extends RoomReservation{
    double saleRatio;
    public TwinRoomReservation(String name, int day, String room, int people) {
        super(name, day, room, people);
        init();
    }
    @Override
    public void init() {
        Room = "twin";
        People = 3;
        Price = 250000;
        saleRatio = 0.1 ;
    }


    @Override
    public int calcPrice() {
        return (int) ((Price-(Price*saleRatio))*ReservationDay);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }

    @Override
    public String showRoomInfo() {
        return super.showRoomInfo();
    }
}
