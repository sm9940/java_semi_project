package semi01.project;

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
        Name=name;
        ReservationDay=day;
        Room= room;
        People=people;
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
    public void showCustomerInfo(){
        System.out.println("지불 비용: "+calcPrice()+"예약자명: "+ getName()+"예약 일수: "+ getReservationDay()+"예약 룸: "+ getRoom()+"인원: "+getPeople());

    }
    public void showRoomInfo(){
        System.out.println("룸 이름: "+Room+" 인원: "+People+" 비용: "+Price);
    }
}
