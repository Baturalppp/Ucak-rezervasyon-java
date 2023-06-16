import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Rezervasyon {
    private Ucak aircraft;
    private Lokasyon departure;
    private Lokasyon destination;
    private LocalDate departureDate;
    private LocalDate returnDate;
    private Kisi kisi;
    private int seatNumber;
    private LocalTime reservationTime;

    private static final Random random = new Random();

    public Reservation(Ucak ucak, Lokasyon departure, Lokasyon destination,
                       LocalDate departureDate, LocalDate returnDate, Kisi kisi) {
        this.ucak = ucak;
        this.departure = departure;
        this.destination = destination;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.kisi = kisi;
        this.reservationTime = generateRandomTime();
        this.seatNumber = generateRandomSeatNumber();
    }

    private LocalTime generateRandomTime() {
        int hour = random.nextInt(24);
        int minute = random.nextInt(60);
        return LocalTime.of(hour, minute);
    }

    private int generateRandomSeatNumber() {
        return random.nextInt(ucak.getyolcukapasitesi()) + 1;
    }
    
    public LocalTime getReservationTime() {
        return reservationTime;
    }
    
    public int getSeatNumber() {
        return seatNumber;
    }


    @Override
    public String toString() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String departureDateString = departureDate.format(dateFormatter);
        String returnDateString = returnDate.format(dateFormatter);
        return " - Yolcu = " + kisi +
                "\n - UÇAK= " + ucak +
                "\n - LOKASYON= Kalkış Noktası -> " + departure + " / Varış Noktası -> " + destination +
                "\n \n - TARİH/SAAT = " + departureDateString + " - " + returnDateString + " - " + reservationTime +
                "\n \n - KOLTUK NO = " + seatNumber +
                "\n \n >Rezervasyonunuz oluşturulmuştur iyi uçuşlar dileriz." +
                "\n !Rezervasyon bilgileriniz ve ücretler e-mail adresinize gönderilmiştir!";
    }
}