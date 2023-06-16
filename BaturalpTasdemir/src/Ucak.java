import java.util.Random;

public class Ucak {
    private String model;
    private int yolcukapasitesi;
    private int seriNo;
    private double fiyat;

    public int getKapasite() {
        return yolcukapasitesi; 
    }
    public Ucak(String model, int yolcukapasitesi, int seriNo )
      this.model= model;
      this.yolcukapasitesi = yolcukapasitesi;
      this.seriNo = seriNo; 
      this.fiyat = new Random().nextInt(5000 - 1000) + 1000;
    @Override
    public String toString(){
        return "Uçak Modeli =" + model
               "Kapasite =" + yolcukapasitesi
               "SeriNo =" + seriNo
               "Fiyat =" + fiyat + "\n"

    }
}


    

