import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        UcakOlusturma ucakOlusturma = new UcakOlusturma();
        Ucak[] ucak = UcakOlusturma.getUcak();

        LokasyonOlusturma lokasyonOlusturma = new LokasyonOlusturma();
        Lokasyon[] lokasyon = LokasyonOlusturma.getLokasyon();

        System.out.print("> Lütfen Adınızı Girin = ");
        String ad = scanner.nextLine();

        System.out.print("> Lütfen Soyadınızı Girin = ");
        String soyad = scanner.nextLine();

        System.out.print("> Lütfen KimlikNo Girin = ");
        String tcno = scanner.nextLine();

        System.out.print("> Lütfen Telefon Numaranızı Girin = ");
        String telefonno = scanner.nextLine();

        System.out.print("> Lütfen E-posta Adresinizi Girin = ");
        String email = scanner.nextLine();

        System.out.print("> Engeliniz Var mı (Has Special Needs - E/H ) ? (E/H): ");
        boolean engel = scanner.nextLine().equalsIgnoreCase("E");

        System.out.println("\n|Şu An Aktif Olan Uçuş Ve Havalimanı Güzergahları| \n");

        System.out.println("> Mevcut Uçuş Noktaları = \n");
        for (int i = 0; i < lokasyon.length; i++) {
            System.out.println((i + 1) + ". " + lokasyon[i]);
        }

        Lokayon departure;
        Lokasyon destination;

        while (true) {
            System.out.print("\n> Lütfen Uçuş Güzergahınızı Girin = ");
            int departureIndex = Integer.parseInt(scanner.nextLine()) - 1;
            departure = lokasyon[departureIndex];

            if (departureIndex != destinationIndex) {
                break;
            }
        }

        System.out.println("\n|Şu An Aktif Olan Uçaklar Ve Boş Koltuk - Hız Bilgileri| \n");

        System.out.println("> Mevcut Uçaklar = ");
        for (int i = 0; i < ucak.length; i++) {
            System.out.println((i + 1) + ". " + ucak[i]);
        }

        System.out.print("\n> Lütfen Uçak Tercihinizi Yapın (flight Choice's) = ");
        int ucakIndex = Integer.parseInt(scanner.nextLine()) - 1;
        Ucak ucak = ucak[ucakIndex];

        System.out.println("\n|TARİH(DATE)| \n");

        System.out.print("> Lütfen Gidiş Tarihini Girin = ");
        String departureDateStr = scanner.nextLine();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate departureDate = LocalDate.parse(departureDateStr, dateFormatter);

        System.out.print("\n>Lütfen Dönüş Tarihini (gg.aa.yyyy) (Return Date dd.MM.yyyy) Girin = ");
        String returnDateStr = scanner.nextLine();
        LocalDate returnDate = LocalDate.parse(returnDateStr, dateFormatter);

        Kisi kisi = new Kisi(ad, soyad, tcno, telefonno, email, engel);
        Rezervasyon rezervasyon = new Rezervasyon(ucak, departure, destination, departureDate, returnDate, kisi);

        System.out.print("\n>Boşta Olan Koltuk Numarası (Empty Seat Number) = ");
        System.out.println(rezervasyon.getSeatNumber());

        System.out.print("\n>Rezervasyon Saatiniz (Reservation Time) = ");
        System.out.println(rezervasyon.getRezervasyonTime());

        System.out.print("\n>Kabul Etmek İçin Enter'a Basın (Enter for Accept) = ");
        scanner.nextLine();

        System.out.println("\n|Rezervasyonunuz Oluşturulmuştur Aşağıda Görebilirsiniz (Reservation's Confirmed)| \n");
        System.out.println(rezervasyon);

        scanner.close();
    }

}
