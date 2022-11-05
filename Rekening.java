public class Rekening {
    private String name;
    private int Telp;
    private double UangSetor;
    private double NomerRekening, BiayaTagihan;
    private int NamaTagihan;
    private int JumlahAmbil;
    public int TabunganAwal= 500000;

    Rekening(String name, int telp) {
        this.name = name;
        Telp = telp;
    }

    Rekening(double NomerRekening, double UangSetor) {
        this.NomerRekening = NomerRekening;
        this.UangSetor = UangSetor;
    }

    Rekening(double NomerRekening, int JumlahAmbil) {
        this.NomerRekening = NomerRekening;
        this.JumlahAmbil = JumlahAmbil;
    }

     Rekening(double NomerRekeningNasabah, double BiayaTagihan,  int NamaTagihan) {
        this.NomerRekening = NomerRekeningNasabah;
        this.BiayaTagihan = BiayaTagihan;
        this.NamaTagihan = NamaTagihan;
    }



    public void setTelp(int telp) {
        Telp = telp;
    }

    public double getNomerRekening() {
        return NomerRekening;
    }

    public double getUangSetor() {
        return UangSetor;
    }


    public double getBiayaTagihan() {
        return BiayaTagihan;
    }

    public int getNamaTagihan() {
        return NamaTagihan;
    }

    public int getJumlahAmbil() {
        return JumlahAmbil;
    }


}
