public class Lokasyon {
    private String ülke;
    private String şehir;
    private String havalimanı;

    public Location(String ülke, String şehir, String havalimanı) {
        this.ülke = ülke;
        this.şehir = şehir;
        this.havalimanı = havalimanı;
    }

    @Override
    public String toString() {
        return ülke + " (" + şehir + ") | " + havalimanı;
    }
}
