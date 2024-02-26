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
        if(ReservationDay>=3){return (int) ((Price-(Price*saleRatio))*ReservationDay);}
        else{return  Price*ReservationDay; }
    }

    @Override
    public void showCustomerInfo() {
        System.out.println("지불 비용: "+calcPrice()+" "+" 예약자명: "+ getName()+" "+" 예약 일수: "+ getReservationDay()+" "+" 예약 룸: "+ getRoom());
    }

    @Override
    public void showRoomInfo() {
        System.out.println("룸 이름: "+Room+" "+" 인원: "+People+" "+" 비용: "+Price);
    }
}
