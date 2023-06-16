public class Kisi {
    private String ad;
    private String soyad;
    private String tcno;
    private String telefonno;
    private String email;
    private boolean engel;

    public Kisi(String ad, String soyad, String tcno, String telefonno, String email, boolean engel) {
        this.ad = ad;
        this.soyad = soyad;
        this.tcno = tcno;
        this.telefonno = telefonno;
        this.email = email;
        this.engel = engel;
    }

    @Override
    public String toString() {
        return "AD-SOYAD = " + ad + "-" + soyad +
                " KİMLİK-NO = " + tcno +
                " TELEFON-NO = " + telefonno +
                " E-MAİL = " + email +
                " ENGEL DURUMU = " + engel + "\n";
    }
}
