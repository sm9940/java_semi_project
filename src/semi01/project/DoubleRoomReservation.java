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
    public void showCustomerInfo() {
        System.out.println("지불 비용: "+calcPrice()+" "+" 예약자명: "+ getName()+" "+" 예약 일수: "+ getReservationDay()+" "+"  예약 룸: "+ getRoom());

    }

    @Override
    public void showRoomInfo() {
        System.out.println("룸 이름: "+Room+" "+" 인원: "+People+" "+" 비용: "+Price);
    }
}
