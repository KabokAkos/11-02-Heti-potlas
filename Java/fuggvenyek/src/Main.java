import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        LocalDate date = LocalDate.of(2005, 11, 03);

        System.out.println("Az év hányadik napján születettél: " + date.getDayOfYear());
        System.out.println("Az év milyen napján születettél: " + date.getDayOfWeek());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Adj meg egy születési dátumot: ");
        String datum = scanner.next();

        String[] dateArray = datum.split("-");

        LocalDate newDate = LocalDate.of(Integer.parseInt(dateArray[0]), Integer.parseInt(dateArray[1]), Integer.parseInt(dateArray[2]));
        System.out.println(newDate);
    }
}
