import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Sec;
        System.out.println("Enter time : ");
        Sec = input.nextInt();
        int hour = Sec/3600;
        Sec = Sec-(hour*3600);

        int min = Sec/60;
        Sec = Sec-(min*60);

        System.out.println("HH:MM:SS\n"+hour+":"+min+ ":"+Sec);
    }
}
