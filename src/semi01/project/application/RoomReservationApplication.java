package semi01.project.application;

import semi01.project.DoubleRoomReservation;
import semi01.project.RoomReservation;
import semi01.project.SweetRoomReservation;
import semi01.project.TwinRoomReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomReservationApplication {

    public static ArrayList<RoomReservation> list = new ArrayList<>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("1. 예약 | 2. 모든 룸의 정보 보기 | 3. 모든 고객의 예약 정보 보기 | " +
                    "4. 특정 고객의 예약 정보 보기 | 5. 프로그램 종료");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    reservation();
                    break;
                case 2: RoomInfo();
                    ;
                    break;
                case 3: customerInfo();
                    break;
                case 4: personInfo();
                    break;
                case 5:
                    run = false;
            }
        }
    }

    public static void reservation() {
        System.out.print("예약자명: ");
        String name = scanner.next();
        System.out.print("예약 일수: ");
        int day = scanner.nextInt();

        System.out.print("예약할 룸: ");
        String room = scanner.next();
        System.out.print("인원: ");
        int people = scanner.nextInt();

        switch (room) {
            case "single":
                RoomReservation single = new RoomReservation(name,day,room,people);
                if(people>single.getPeople()){
                    System.out.println("인원이 초과되었습니다.");
                    break;}
                else {
                    list.add(single);
                    System.out.println("예약 완료되었습니다.");}
                break;
            case "double":
                    RoomReservation Double = new DoubleRoomReservation(name, day, room, people);
                if(people>Double.getPeople()){
                    System.out.println("인원이 초과되었습니다.");
                    break;
                }else {
                    list.add(Double);
                }

                break;
            case "twin":
                    RoomReservation twin = new TwinRoomReservation(name, day, room, people);
                if(people>twin.getPeople()){System.out.println("인원이 초과되었습니다.");
                    break;} else {
                    list.add(twin);
                    System.out.println("예약 완료되었습니다.");
                }
                break;
            case "sweet":
                RoomReservation sweet = new SweetRoomReservation(name, day, room, people);
                if(people>5){
                    System.out.println("인원이 초과되었습니다.");
                    break;
                } else {
                    list.add(sweet);
                    System.out.println("예약 완료되었습니다.");
                }
                break;
        }

    }

    public static void RoomInfo(){
        RoomReservation single = new RoomReservation("1",2,"single",1);
        single.showRoomInfo();
        RoomReservation Double = new DoubleRoomReservation("1",2,"double",2);
        Double.showRoomInfo();
        RoomReservation twin =new TwinRoomReservation("1",2,"twin",3);
        twin.showRoomInfo();
        RoomReservation sweet = new SweetRoomReservation("1",2,"sweet",5);
        sweet.showRoomInfo();
    }
    public static void customerInfo(){
        // 예약 정보를 모두 출력
        System.out.println("===== 예약 정보 =====");
        for (RoomReservation reservation : list) {
            reservation.showCustomerInfo();
        }
    }
    public static void personInfo(){
        System.out.println("예약자명: ");
        String name = scanner.next();
        for (RoomReservation reservation:list){
            if(name.equals(reservation.getName())){
                reservation.showCustomerInfo();
            }
        }
    }
}
