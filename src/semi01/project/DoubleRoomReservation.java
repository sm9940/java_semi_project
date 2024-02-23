package semi01.project;

public class DoubleRoomReservation extends RoomReservation{
   public double saleRatio; //할인율

    public DoubleRoomReservation(String name, int day, String room, int people) {
        super(name, day, room, people);
        init();
    }


    @Override
    public void init() {
        Room = "double";
        People = 2;
        Price = 200000;
        saleRatio = 0.05;
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
