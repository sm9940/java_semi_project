package semi01.project.application;

import semi01.project.RoomReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class RoomReservationApplication {

    public  static ArrayList <RoomReservation> list = new ArrayList<>();
    public static void main(String[] args) {
boolean run = true;
while (run){
    System.out.println("1. 예약 | 2. 모든 룸의 정보 보기 | 3. 모든 고객의 예약 정보 보기 | " +
            "4. 특정 고객의 예약 정보 보기 | 5. 프로그램 종료");
   int select =  scanner.nextInt();
   switch (select){
       case 1: reservation();

           break;
       case 2:
           System.out.println();
           break;
       case 3: break;
       case 4: break;
       case 5: run = false;
   }
}




    }

  public static   Scanner scanner = new Scanner(System.in);
public static void reservation(){
    System.out.print("예약자명: ");
    String name = scanner.next();
    System.out.print("예약 일수: ");
    int day = scanner.nextInt();

    System.out.print("예약할 룸: ");
    String room = scanner.next();
    System.out.print("인원: ");
    int people = scanner.nextInt();
    switch (room){
        case "single": RoomReservation single = new RoomReservation(name,day,room,people);

            if(single.getPeople()<people){
                System.out.println("인원이 초과되었습니다.");
            } else {
                list.add(single);
            }
            break;
        case "double":
            RoomReservation Double = new RoomReservation(name,day,room,people);
            if(Double.getPeople()<people){
                System.out.println("인원이 초과되었습니다.");
            } else {
                list.add(Double);
            }
            break;
        case "twin": RoomReservation twin = new RoomReservation(name,day,room,people);

            if(twin.getPeople()<people){
                System.out.println("인원이 초과되었습니다.");
            } else {
                list.add(twin);
            }
            break;
        case "sweet": RoomReservation sweet = new RoomReservation(name,day,room,people);
            if(sweet.getPeople()<people){
                System.out.println("인원이 초과되었습니다.");
            } else {
                list.add(sweet);
            }
            break;
    }

    }
    public static void payPrice(){

    }
}


