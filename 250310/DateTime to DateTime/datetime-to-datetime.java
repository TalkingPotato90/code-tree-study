import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int startDay = 11, startHour = 11, startMinute = 11;

        if (A < startDay || 
            (A == startDay && B < startHour) || 
            (A == startDay && B == startHour && C < startMinute)) {
            System.out.println("-1");
            return;
        }

        int elapsedMinutes = 0;
        int day = startDay, hour = startHour, minute = startMinute;

        while (day < A || hour < B || minute < C) {
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