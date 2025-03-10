import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int startDay = 11; 
        int startHour = 11;
        int startMinute = 11;

        int endDay = 11;
        int endHour = 11;
        int endMinute = 11;

        if(A >= 11){
            endDay = A;
        }else{
            startDay = A;
            endDay = 11;
        }

        if(B >= 11){
            endHour = B;
        }else{
            startHour = B;
            endHour = 11;
        }

        if(C >= 11){
            endMinute = C;
        }else{
            startMinute = C;
            endMinute = 11;
        }

        int elapsedMinutes = 0;

        int day = startDay, hour = startHour, minute = startMinute;

        while (day < endDay || hour < endHour || minute < endMinute) {
            minute++;
            elapsedMinutes++;

            if (minute == 60) {
                minute = 0;
                hour++;
            }
            if (hour == 24) {
                hour = 0;
                day++;
            }
        }

        System.out.println(elapsedMinutes);
    }
}