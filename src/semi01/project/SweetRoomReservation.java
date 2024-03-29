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
        People= Integer.MAX_VALUE;
        Price = 500000;
        saleRatio = 0.2 ;
        breakfast="O";
    }

    @Override
    public int calcPrice() {if(ReservationDay>=3){return (int) ((Price-(Price*saleRatio))*ReservationDay)
            ;}
            else{return  Price*ReservationDay; }

    }

    @Override
    public void showCustomerInfo() {
        System.out.println("지불 비용: "+calcPrice()+" "+" 예약자명: "+ getName()+" "+" 예약 일수: "+ getReservationDay()+" "+" 예약 룸: "+ getRoom()+" "+" 조식여부:"+breakfast);
    }

    @Override
    public void showRoomInfo() {
        System.out.println("룸 이름: "+Room+" "+" 인원: "+People+" "+" 비용: "+Price+" "+" 조식여부:"+breakfast);

    }
}
