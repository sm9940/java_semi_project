package semi01.project;

public class SweetRoomReservation extends RoomReservation{
    double saleRatio;
    String  breakfast;

    public SweetRoomReservation(String name, int day, String room, int people) {
        super(name, day, room, people);
        init();
    }

    @Override
    public void init() {
        Room = "sweet";
        People = 5;
        Price = 500000;
        saleRatio = 0.2 ;
        breakfast="O";
    }

    @Override
    public int calcPrice() {
        return (int) ((Price-(Price*saleRatio))*ReservationDay);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo()+breakfast;
    }

    @Override
    public String showRoomInfo() {
        return super.showRoomInfo();
    }
}
